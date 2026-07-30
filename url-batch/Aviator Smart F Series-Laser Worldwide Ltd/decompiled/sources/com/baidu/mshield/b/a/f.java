package com.baidu.mshield.b.a;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes2.dex */
public class f {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f8310a;

        /* renamed from: b, reason: collision with root package name */
        public String f8311b;

        /* renamed from: c, reason: collision with root package name */
        public String f8312c;

        public a(int i8, String str, String str2) {
            this.f8310a = i8;
            this.f8311b = str;
            this.f8312c = str2;
        }

        public String toString() {
            return "CommandResult{result=" + this.f8310a + ", successMsg='" + this.f8311b + "', errorMsg='" + this.f8312c + "'}";
        }
    }

    public static a a(String str, boolean z7) {
        return a(new String[]{str}, z7, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0161, code lost:
    
        if (r10 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013d, code lost:
    
        r9 = r11;
        r11 = r1;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x013b, code lost:
    
        if (r10 != null) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0178: IF  (r3 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:132:0x017d, block:B:130:0x0178 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x017d: IF  (r5 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:138:0x0186, block:B:132:0x017d */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0188 A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[DONT_GENERATE, FINALLY_INSNS, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0155 A[Catch: IOException -> 0x0151, TryCatch #7 {IOException -> 0x0151, blocks: (B:83:0x014d, B:73:0x0155, B:75:0x015a), top: B:82:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015a A[Catch: IOException -> 0x0151, TRY_LEAVE, TryCatch #7 {IOException -> 0x0151, blocks: (B:83:0x014d, B:73:0x0155, B:75:0x015a), top: B:82:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012f A[Catch: IOException -> 0x012b, TryCatch #8 {IOException -> 0x012b, blocks: (B:99:0x0127, B:90:0x012f, B:92:0x0134), top: B:98:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0134 A[Catch: IOException -> 0x012b, TRY_LEAVE, TryCatch #8 {IOException -> 0x012b, blocks: (B:99:0x0127, B:90:0x012f, B:92:0x0134), top: B:98:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean, java.lang.Process] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a a(String[] strArr, boolean z7, boolean z8) {
        Process process;
        String str;
        ?? r12;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        int i8;
        String str2;
        String str3;
        ?? r11;
        ?? r112;
        DataOutputStream dataOutputStream = null;
        String str4 = null;
        String str5 = null;
        BufferedReader bufferedReader3 = null;
        DataOutputStream dataOutputStream2 = null;
        int i9 = -1;
        if (strArr != null) {
            try {
                if (strArr.length != 0) {
                    try {
                        process = Runtime.getRuntime().exec(z7 != 0 ? "su" : "sh");
                    } catch (IOException e8) {
                        e = e8;
                        process = null;
                    } catch (Throwable th) {
                        th = th;
                        process = null;
                    }
                    try {
                        DataOutputStream dataOutputStream3 = new DataOutputStream(process.getOutputStream());
                        try {
                            for (String str6 : strArr) {
                                if (str6 != null) {
                                    dataOutputStream3.write(str6.getBytes());
                                    dataOutputStream3.writeBytes("\n");
                                    dataOutputStream3.flush();
                                }
                            }
                            dataOutputStream3.writeBytes("exit\n");
                            dataOutputStream3.flush();
                            i9 = process.waitFor();
                            if (z8) {
                                StringBuilder sb = new StringBuilder();
                                StringBuilder sb2 = new StringBuilder();
                                bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                                try {
                                    bufferedReader2 = new BufferedReader(new InputStreamReader(process.getErrorStream()));
                                    while (true) {
                                        try {
                                            String readLine = bufferedReader.readLine();
                                            if (readLine == null) {
                                                break;
                                            }
                                            sb.append(readLine);
                                            sb.append(b5.b.VERTICAL);
                                        } catch (IOException e9) {
                                            e = e9;
                                            r112 = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r11 = null;
                                        }
                                    }
                                    str2 = sb.toString();
                                } catch (IOException e10) {
                                    e = e10;
                                    str = null;
                                    bufferedReader2 = null;
                                    dataOutputStream2 = dataOutputStream3;
                                    i8 = i9;
                                    r12 = bufferedReader2;
                                    com.baidu.mshield.b.c.a.a(e);
                                    if (dataOutputStream2 != null) {
                                        try {
                                            dataOutputStream2.close();
                                        } catch (IOException e11) {
                                            com.baidu.mshield.b.c.a.a(e11);
                                        }
                                    }
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (bufferedReader2 != null) {
                                        bufferedReader2.close();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    str = null;
                                    bufferedReader2 = null;
                                    dataOutputStream = dataOutputStream3;
                                    i8 = i9;
                                    r12 = bufferedReader2;
                                    com.baidu.mshield.b.c.a.a(th);
                                    if (dataOutputStream != null) {
                                        try {
                                            dataOutputStream.close();
                                        } catch (IOException e12) {
                                            com.baidu.mshield.b.c.a.a(e12);
                                        }
                                    }
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (bufferedReader2 != null) {
                                        bufferedReader2.close();
                                    }
                                }
                                try {
                                    if (str2.length() > 0) {
                                        str2 = str2.substring(0, str2.length() - 1);
                                    }
                                    while (true) {
                                        String readLine2 = bufferedReader2.readLine();
                                        if (readLine2 == null) {
                                            break;
                                        }
                                        sb2.append(readLine2);
                                        sb2.append(b5.b.VERTICAL);
                                    }
                                    String sb3 = sb2.toString();
                                    if (sb3.length() > 0) {
                                        sb3 = sb3.substring(0, sb3.length() - 1);
                                    }
                                    str3 = sb3;
                                    bufferedReader3 = bufferedReader;
                                } catch (IOException e13) {
                                    str4 = str2;
                                    e = e13;
                                    r112 = null;
                                    r12 = r112;
                                    str = str4;
                                    dataOutputStream2 = dataOutputStream3;
                                    i8 = i9;
                                    com.baidu.mshield.b.c.a.a(e);
                                    if (dataOutputStream2 != null) {
                                    }
                                    if (bufferedReader != null) {
                                    }
                                    if (bufferedReader2 != null) {
                                    }
                                } catch (Throwable th4) {
                                    str5 = str2;
                                    th = th4;
                                    r11 = null;
                                    r12 = r11;
                                    str = str5;
                                    dataOutputStream = dataOutputStream3;
                                    i8 = i9;
                                    com.baidu.mshield.b.c.a.a(th);
                                    if (dataOutputStream != null) {
                                    }
                                    if (bufferedReader != null) {
                                    }
                                    if (bufferedReader2 != null) {
                                    }
                                }
                            } else {
                                str2 = null;
                                str3 = null;
                                bufferedReader2 = null;
                            }
                            try {
                                dataOutputStream3.close();
                                if (bufferedReader3 != null) {
                                    bufferedReader3.close();
                                }
                                if (bufferedReader2 != null) {
                                    bufferedReader2.close();
                                }
                            } catch (IOException e14) {
                                com.baidu.mshield.b.c.a.a(e14);
                            }
                        } catch (IOException e15) {
                            e = e15;
                            str = null;
                            bufferedReader = null;
                            bufferedReader2 = null;
                        } catch (Throwable th5) {
                            th = th5;
                            str = null;
                            bufferedReader = null;
                            bufferedReader2 = null;
                        }
                    } catch (IOException e16) {
                        e = e16;
                        str = null;
                        r12 = 0;
                        bufferedReader = null;
                        bufferedReader2 = null;
                        i8 = -1;
                        com.baidu.mshield.b.c.a.a(e);
                        if (dataOutputStream2 != null) {
                        }
                        if (bufferedReader != null) {
                        }
                        if (bufferedReader2 != null) {
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        str = null;
                        r12 = 0;
                        bufferedReader = null;
                        bufferedReader2 = null;
                        i8 = -1;
                        com.baidu.mshield.b.c.a.a(th);
                        if (dataOutputStream != null) {
                        }
                        if (bufferedReader != null) {
                        }
                        if (bufferedReader2 != null) {
                        }
                    }
                    process.destroy();
                    i8 = i9;
                    r12 = str3;
                    str = str2;
                    return new a(i8, str, r12);
                }
            } finally {
            }
        }
        return new a(-1, null, null);
    }
}
