package c5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes4.dex */
public class e {
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean unZipFolder(String str, String str2) {
        ZipInputStream zipInputStream;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                zipInputStream = new ZipInputStream(fileInputStream2);
                while (true) {
                    try {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry != null) {
                            String name = nextEntry.getName();
                            if (nextEntry.isDirectory()) {
                                new File(str2 + File.separator + name.substring(0, name.length() - 1)).mkdirs();
                            } else {
                                File file = new File(str2 + File.separator + name);
                                file.createNewFile();
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = zipInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                    fileOutputStream.flush();
                                }
                                fileOutputStream.close();
                            }
                        } else {
                            try {
                                break;
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                        }
                    } catch (Exception e9) {
                        e = e9;
                        fileInputStream = fileInputStream2;
                        try {
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                }
                            }
                            if (zipInputStream != null) {
                                try {
                                    zipInputStream.close();
                                } catch (IOException e11) {
                                    e11.printStackTrace();
                                }
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e12) {
                                    e12.printStackTrace();
                                }
                            }
                            if (zipInputStream != null) {
                                throw th;
                            }
                            try {
                                zipInputStream.close();
                                throw th;
                            } catch (IOException e13) {
                                e13.printStackTrace();
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                        }
                        if (zipInputStream != null) {
                        }
                    }
                }
                fileInputStream2.close();
                try {
                    zipInputStream.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
                return true;
            } catch (Exception e15) {
                e = e15;
                zipInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                zipInputStream = null;
            }
        } catch (Exception e16) {
            e = e16;
            zipInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            zipInputStream = null;
        }
    }
}
