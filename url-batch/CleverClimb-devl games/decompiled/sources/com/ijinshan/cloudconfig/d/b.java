package com.ijinshan.cloudconfig.d;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONObject;

/* compiled from: FileUtil.java */
/* loaded from: classes2.dex */
public class b {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        if (r5 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject a(File file) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        bufferedReader2 = null;
        r0 = null;
        JSONObject jSONObject = null;
        if (file == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            fileReader = new FileReader(file);
            try {
                bufferedReader = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        stringBuffer.append(readLine);
                    } catch (Exception unused) {
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (IOException unused2) {
                            }
                        }
                    } catch (Throwable th) {
                        bufferedReader2 = bufferedReader;
                        th = th;
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                                throw th;
                            } catch (IOException unused4) {
                                throw th;
                            }
                        }
                        throw th;
                    }
                }
                jSONObject = stringBuffer.length() > 0 ? new JSONObject(stringBuffer.toString()) : null;
                try {
                    fileReader.close();
                } catch (IOException unused5) {
                }
            } catch (Exception unused6) {
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused7) {
            bufferedReader = null;
            fileReader = null;
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
        }
        try {
            bufferedReader.close();
        } catch (IOException unused8) {
        }
        return jSONObject;
    }

    public static JSONObject a(String str) {
        a.a("zzb_cloud", "loadJsonFromFile");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(new File(str));
    }

    public static boolean a(JSONObject jSONObject, File file) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes());
        try {
            return a(byteArrayInputStream, file);
        } finally {
            try {
                byteArrayInputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(JSONObject jSONObject, String str) {
        return a(jSONObject, new File(str));
    }

    /* JADX WARN: Finally extract failed */
    public static boolean a(InputStream inputStream, File file) {
        try {
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read < 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.flush();
                try {
                    fileOutputStream.getFD().sync();
                } catch (IOException unused) {
                }
                fileOutputStream.close();
                return true;
            } catch (Throwable th) {
                fileOutputStream.flush();
                try {
                    fileOutputStream.getFD().sync();
                } catch (IOException unused2) {
                }
                fileOutputStream.close();
                throw th;
            }
        } catch (IOException unused3) {
            return false;
        }
    }
}
