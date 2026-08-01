package com.rnmaps.maps;

import android.content.Context;
import android.util.Log;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes2.dex */
public class MapTileWorker extends Worker {
    private static final int BUFFER_SIZE = 16384;

    public MapTileWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        String string = getInputData().getString("filename");
        try {
            int i = getInputData().getInt("maxAge", 0);
            if (i >= 0) {
                if ((System.currentTimeMillis() - new File(string).lastModified()) / 1000 < i) {
                    return ListenableWorker.Result.failure();
                }
            }
            try {
                byte[] fetchTile = fetchTile(new URL(getInputData().getString(ImagesContract.URL)));
                if (fetchTile != null) {
                    if (!writeTileImage(fetchTile, string)) {
                        return ListenableWorker.Result.failure();
                    }
                    Log.d("urlTile", "Worker fetched " + string);
                    return ListenableWorker.Result.success();
                }
                return ListenableWorker.Result.retry();
            } catch (MalformedURLException e) {
                throw new AssertionError(e);
            }
        } catch (Error unused) {
            return ListenableWorker.Result.failure();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.net.URL] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private byte[] fetchTile(URL url) {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream2;
        try {
            try {
                url = url.openStream();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = url.read(bArr, 0, 16384);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream2.write(bArr, 0, read);
                    }
                    byteArrayOutputStream2.flush();
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    if (url != 0) {
                        try {
                            url.close();
                        } catch (Exception unused) {
                        }
                    }
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception unused2) {
                    }
                    return byteArray;
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    if (url != 0) {
                        try {
                            url.close();
                        } catch (Exception unused3) {
                        }
                    }
                    if (byteArrayOutputStream2 != null) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception unused4) {
                        }
                    }
                    return null;
                } catch (OutOfMemoryError e2) {
                    e = e2;
                    e.printStackTrace();
                    if (url != 0) {
                    }
                    if (byteArrayOutputStream2 != null) {
                    }
                    return null;
                }
            } catch (IOException e3) {
                e = e3;
                byteArrayOutputStream2 = null;
                e.printStackTrace();
                if (url != 0) {
                }
                if (byteArrayOutputStream2 != null) {
                }
                return null;
            } catch (OutOfMemoryError e4) {
                e = e4;
                byteArrayOutputStream2 = null;
                e.printStackTrace();
                if (url != 0) {
                }
                if (byteArrayOutputStream2 != null) {
                }
                return null;
            } catch (Throwable th3) {
                byteArrayOutputStream = null;
                th = th3;
                if (url != 0) {
                    try {
                        url.close();
                    } catch (Exception unused5) {
                    }
                }
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (Exception unused6) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            url = 0;
            byteArrayOutputStream2 = null;
            e.printStackTrace();
            if (url != 0) {
            }
            if (byteArrayOutputStream2 != null) {
            }
            return null;
        } catch (OutOfMemoryError e6) {
            e = e6;
            url = 0;
            byteArrayOutputStream2 = null;
            e.printStackTrace();
            if (url != 0) {
            }
            if (byteArrayOutputStream2 != null) {
            }
            return null;
        } catch (Throwable th4) {
            byteArrayOutputStream = null;
            th = th4;
            url = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean writeTileImage(byte[] bArr, String str) {
        FileOutputStream fileOutputStream;
        if (str == null) {
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                File file = new File(str);
                file.getParentFile().mkdirs();
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        } catch (OutOfMemoryError e2) {
            e = e2;
        }
        try {
            fileOutputStream.write(bArr);
            try {
                fileOutputStream.close();
                return true;
            } catch (Exception unused) {
                return true;
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (Exception unused2) {
                }
            }
            return false;
        } catch (OutOfMemoryError e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }
}
