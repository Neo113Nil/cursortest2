package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public final class zzbl extends zzar {
    private volatile String zztz;
    private Future<String> zzxn;

    protected zzbl(zzat zzatVar) {
        super(zzatVar);
    }

    private final boolean zzb(Context context, String str) {
        FileOutputStream openFileOutput;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotMainThread("ClientId should be saved from worker thread");
        FileOutputStream fileOutputStream = null;
        try {
            try {
                zza("Storing clientId", str);
                openFileOutput = context.openFileOutput("gaClientId", 0);
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException e) {
            e = e;
        } catch (IOException e2) {
            e = e2;
        }
        try {
            openFileOutput.write(str.getBytes());
            if (openFileOutput == null) {
                return true;
            }
            try {
                openFileOutput.close();
                return true;
            } catch (IOException e3) {
                zze("Failed to close clientId writing stream", e3);
                return true;
            }
        } catch (FileNotFoundException e4) {
            e = e4;
            fileOutputStream = openFileOutput;
            zze("Error creating clientId file", e);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e5) {
                    zze("Failed to close clientId writing stream", e5);
                }
            }
            return false;
        } catch (IOException e6) {
            e = e6;
            fileOutputStream = openFileOutput;
            zze("Error writing to clientId file", e);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e7) {
                    zze("Failed to close clientId writing stream", e7);
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = openFileOutput;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e8) {
                    zze("Failed to close clientId writing stream", e8);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzd(Context context) {
        FileInputStream fileInputStream;
        Preconditions.checkNotMainThread("ClientId should be loaded from worker thread");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = context.openFileInput("gaClientId");
                try {
                    byte[] bArr = new byte[36];
                    int read = fileInputStream.read(bArr, 0, 36);
                    if (fileInputStream.available() > 0) {
                        zzt("clientId file seems corrupted, deleting it.");
                        fileInputStream.close();
                        context.deleteFile("gaClientId");
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e) {
                                zze("Failed to close client id reading stream", e);
                            }
                        }
                        return null;
                    }
                    if (read < 14) {
                        zzt("clientId file is empty, deleting it.");
                        fileInputStream.close();
                        context.deleteFile("gaClientId");
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e2) {
                                zze("Failed to close client id reading stream", e2);
                            }
                        }
                        return null;
                    }
                    fileInputStream.close();
                    String str = new String(bArr, 0, read);
                    zza("Read client id from disk", str);
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                            zze("Failed to close client id reading stream", e3);
                        }
                    }
                    return str;
                } catch (FileNotFoundException unused) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                            zze("Failed to close client id reading stream", e4);
                        }
                    }
                    return null;
                } catch (IOException e5) {
                    e = e5;
                    zze("Error reading client id file, deleting it", e);
                    context.deleteFile("gaClientId");
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e6) {
                            zze("Failed to close client id reading stream", e6);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException e7) {
                        zze("Failed to close client id reading stream", e7);
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            fileInputStream = null;
        } catch (IOException e8) {
            e = e8;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @VisibleForTesting
    public final String zzdq() {
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        try {
            return !zzb(zzbw().getContext(), lowerCase) ? "0" : lowerCase;
        } catch (Exception e) {
            zze("Error saving clientId file", e);
            return "0";
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x0050, TryCatch #0 {, blocks: (B:4:0x0004, B:6:0x0008, B:7:0x0017, B:15:0x001b, B:16:0x003a, B:18:0x003e, B:19:0x0042, B:9:0x004c, B:10:0x004e, B:22:0x0027, B:23:0x002e, B:25:0x0032), top: B:3:0x0004, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zzdn() {
        String str;
        zzch();
        synchronized (this) {
            if (this.zztz == null) {
                this.zzxn = zzbw().zza(new zzbm(this));
            }
            if (this.zzxn != null) {
                try {
                    try {
                        this.zztz = this.zzxn.get();
                    } catch (ExecutionException e) {
                        zze("Failed to load or generate client id", e);
                        str = "0";
                        this.zztz = str;
                        if (this.zztz == null) {
                        }
                        zza("Loaded clientId", this.zztz);
                        this.zzxn = null;
                        return this.zztz;
                    }
                } catch (InterruptedException e2) {
                    zzd("ClientId loading or generation was interrupted", e2);
                    str = "0";
                    this.zztz = str;
                    if (this.zztz == null) {
                    }
                    zza("Loaded clientId", this.zztz);
                    this.zzxn = null;
                    return this.zztz;
                }
                if (this.zztz == null) {
                    this.zztz = "0";
                }
                zza("Loaded clientId", this.zztz);
                this.zzxn = null;
            }
        }
        return this.zztz;
    }

    final String zzdo() {
        synchronized (this) {
            this.zztz = null;
            this.zzxn = zzbw().zza(new zzbn(this));
        }
        return zzdn();
    }

    @VisibleForTesting
    final String zzdp() {
        String zzd = zzd(zzbw().getContext());
        return zzd == null ? zzdq() : zzd;
    }
}
