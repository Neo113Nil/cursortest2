package com.blankj.utilcode.util;

import androidx.annotation.NonNull;
import com.baidu.platform.comapi.walknavi.fsm.RGState;
import com.blankj.utilcode.util.z0;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/* loaded from: classes2.dex */
public final class t0 {
    private static final String LINE_SEP = System.getProperty("line.separator");

    static class a extends z0.d {
        final /* synthetic */ String[] val$commands;
        final /* synthetic */ boolean val$isNeedResultMsg;
        final /* synthetic */ boolean val$isRooted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z0.b bVar, String[] strArr, boolean z7, boolean z8) {
            super(bVar);
            this.val$commands = strArr;
            this.val$isRooted = z7;
            this.val$isNeedResultMsg = z8;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.e
        public b doInBackground() {
            return t0.execCmd(this.val$commands, this.val$isRooted, this.val$isNeedResultMsg);
        }
    }

    public static class b {
        public String errorMsg;
        public int result;
        public String successMsg;

        public b(int i8, String str, String str2) {
            this.result = i8;
            this.successMsg = str;
            this.errorMsg = str2;
        }

        public String toString() {
            return "result: " + this.result + "\nsuccessMsg: " + this.successMsg + "\nerrorMsg: " + this.errorMsg;
        }
    }

    private t0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static b execCmd(String str, boolean z7) {
        return execCmd(new String[]{str}, z7, true);
    }

    public static z0.d execCmdAsync(String str, boolean z7, z0.b bVar) {
        return execCmdAsync(new String[]{str}, z7, true, bVar);
    }

    public static b execCmd(String str, List<String> list, boolean z7) {
        return execCmd(new String[]{str}, list == null ? null : (String[]) list.toArray(new String[0]), z7, true);
    }

    public static z0.d execCmdAsync(List<String> list, boolean z7, z0.b bVar) {
        return execCmdAsync(list == null ? null : (String[]) list.toArray(new String[0]), z7, true, bVar);
    }

    public static z0.d execCmdAsync(String[] strArr, boolean z7, z0.b bVar) {
        return execCmdAsync(strArr, z7, true, bVar);
    }

    public static b execCmd(List<String> list, boolean z7) {
        return execCmd(list == null ? null : (String[]) list.toArray(new String[0]), z7, true);
    }

    public static z0.d execCmdAsync(String str, boolean z7, boolean z8, z0.b bVar) {
        return execCmdAsync(new String[]{str}, z7, z8, bVar);
    }

    public static b execCmd(List<String> list, List<String> list2, boolean z7) {
        return execCmd(list == null ? null : (String[]) list.toArray(new String[0]), list2 != null ? (String[]) list2.toArray(new String[0]) : null, z7, true);
    }

    public static z0.d execCmdAsync(List<String> list, boolean z7, boolean z8, z0.b bVar) {
        return execCmdAsync(list == null ? null : (String[]) list.toArray(new String[0]), z7, z8, bVar);
    }

    public static z0.d execCmdAsync(String[] strArr, boolean z7, boolean z8, @NonNull z0.b bVar) {
        return c1.doAsync(new a(bVar, strArr, z7, z8));
    }

    public static b execCmd(String[] strArr, boolean z7) {
        return execCmd(strArr, z7, true);
    }

    public static b execCmd(String str, boolean z7, boolean z8) {
        return execCmd(new String[]{str}, z7, z8);
    }

    public static b execCmd(String str, List<String> list, boolean z7, boolean z8) {
        return execCmd(new String[]{str}, list == null ? null : (String[]) list.toArray(new String[0]), z7, z8);
    }

    public static b execCmd(String str, String[] strArr, boolean z7, boolean z8) {
        return execCmd(new String[]{str}, strArr, z7, z8);
    }

    public static b execCmd(List<String> list, boolean z7, boolean z8) {
        return execCmd(list == null ? null : (String[]) list.toArray(new String[0]), z7, z8);
    }

    public static b execCmd(String[] strArr, boolean z7, boolean z8) {
        return execCmd(strArr, (String[]) null, z7, z8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b execCmd(String[] strArr, String[] strArr2, boolean z7, boolean z8) {
        Process process;
        BufferedReader bufferedReader;
        ?? r10;
        BufferedReader bufferedReader2;
        BufferedReader bufferedReader3;
        StringBuilder sb;
        ?? r11;
        Object obj;
        ?? sb2;
        int i8 = -1;
        if (strArr != null && strArr.length != 0) {
            DataOutputStream dataOutputStream = null;
            BufferedReader bufferedReader4 = null;
            dataOutputStream = null;
            try {
                process = Runtime.getRuntime().exec(z7 ? "su" : "sh", strArr2, (File) null);
                try {
                    DataOutputStream dataOutputStream2 = new DataOutputStream(process.getOutputStream());
                    try {
                        try {
                            for (String str : strArr) {
                                if (str != null) {
                                    dataOutputStream2.write(str.getBytes());
                                    dataOutputStream2.writeBytes(LINE_SEP);
                                    dataOutputStream2.flush();
                                }
                            }
                            dataOutputStream2.writeBytes(RGState.METHOD_NAME_EXIT + LINE_SEP);
                            dataOutputStream2.flush();
                            i8 = process.waitFor();
                            if (z8) {
                                sb = new StringBuilder();
                                try {
                                    sb2 = new StringBuilder();
                                    try {
                                        bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream(), cn.hutool.core.util.l.UTF_8));
                                        try {
                                            bufferedReader2 = new BufferedReader(new InputStreamReader(process.getErrorStream(), cn.hutool.core.util.l.UTF_8));
                                        } catch (Exception e8) {
                                            e = e8;
                                            bufferedReader2 = null;
                                        } catch (Throwable th) {
                                            th = th;
                                            bufferedReader2 = null;
                                        }
                                    } catch (Exception e9) {
                                        e = e9;
                                        bufferedReader = null;
                                        bufferedReader2 = null;
                                    }
                                } catch (Exception e10) {
                                    bufferedReader = null;
                                    bufferedReader2 = null;
                                    dataOutputStream = dataOutputStream2;
                                    r10 = sb;
                                    e = e10;
                                    bufferedReader3 = null;
                                }
                                try {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine != null) {
                                        sb.append(readLine);
                                        while (true) {
                                            String readLine2 = bufferedReader.readLine();
                                            if (readLine2 == null) {
                                                break;
                                            }
                                            sb.append(LINE_SEP);
                                            sb.append(readLine2);
                                        }
                                    }
                                    String readLine3 = bufferedReader2.readLine();
                                    if (readLine3 != null) {
                                        sb2.append(readLine3);
                                        while (true) {
                                            String readLine4 = bufferedReader2.readLine();
                                            if (readLine4 == null) {
                                                break;
                                            }
                                            sb2.append(LINE_SEP);
                                            sb2.append(readLine4);
                                        }
                                    }
                                    bufferedReader4 = bufferedReader;
                                    obj = sb2;
                                } catch (Exception e11) {
                                    e = e11;
                                    dataOutputStream = dataOutputStream2;
                                    r10 = sb;
                                    e = e;
                                    bufferedReader3 = sb2;
                                    try {
                                        e.printStackTrace();
                                        if (dataOutputStream != null) {
                                        }
                                        if (bufferedReader != null) {
                                        }
                                        if (bufferedReader2 != null) {
                                        }
                                        if (process != null) {
                                        }
                                        sb = r10;
                                        r11 = bufferedReader3;
                                        return new b(i8, sb == null ? "" : sb.toString(), r11 != 0 ? r11.toString() : "");
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (dataOutputStream != null) {
                                            try {
                                                dataOutputStream.close();
                                            } catch (IOException e12) {
                                                e12.printStackTrace();
                                            }
                                        }
                                        if (bufferedReader != null) {
                                            try {
                                                bufferedReader.close();
                                            } catch (IOException e13) {
                                                e13.printStackTrace();
                                            }
                                        }
                                        if (bufferedReader2 != null) {
                                            try {
                                                bufferedReader2.close();
                                            } catch (IOException e14) {
                                                e14.printStackTrace();
                                            }
                                        }
                                        if (process != null) {
                                            process.destroy();
                                            throw th;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    dataOutputStream = dataOutputStream2;
                                    if (dataOutputStream != null) {
                                    }
                                    if (bufferedReader != null) {
                                    }
                                    if (bufferedReader2 != null) {
                                    }
                                    if (process != null) {
                                    }
                                }
                            } else {
                                sb = null;
                                obj = null;
                                bufferedReader2 = null;
                            }
                            try {
                                dataOutputStream2.close();
                            } catch (IOException e15) {
                                e15.printStackTrace();
                            }
                            if (bufferedReader4 != null) {
                                try {
                                    bufferedReader4.close();
                                } catch (IOException e16) {
                                    e16.printStackTrace();
                                }
                            }
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException e17) {
                                    e17.printStackTrace();
                                }
                            }
                            process.destroy();
                            r11 = obj;
                        } catch (Exception e18) {
                            e = e18;
                            bufferedReader3 = null;
                            bufferedReader = null;
                            bufferedReader2 = null;
                            dataOutputStream = dataOutputStream2;
                            r10 = null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedReader = null;
                        bufferedReader2 = null;
                    }
                } catch (Exception e19) {
                    e = e19;
                    r10 = null;
                    BufferedReader bufferedReader5 = r10;
                    bufferedReader = bufferedReader5;
                    bufferedReader2 = bufferedReader;
                    bufferedReader3 = bufferedReader5;
                    e.printStackTrace();
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException e20) {
                            e20.printStackTrace();
                        }
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e21) {
                            e21.printStackTrace();
                        }
                    }
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e22) {
                            e22.printStackTrace();
                        }
                    }
                    if (process != null) {
                        process.destroy();
                    }
                    sb = r10;
                    r11 = bufferedReader3;
                    return new b(i8, sb == null ? "" : sb.toString(), r11 != 0 ? r11.toString() : "");
                } catch (Throwable th5) {
                    th = th5;
                    bufferedReader = null;
                    bufferedReader2 = bufferedReader;
                    if (dataOutputStream != null) {
                    }
                    if (bufferedReader != null) {
                    }
                    if (bufferedReader2 != null) {
                    }
                    if (process != null) {
                    }
                }
            } catch (Exception e23) {
                e = e23;
                process = null;
                r10 = null;
            } catch (Throwable th6) {
                th = th6;
                process = null;
                bufferedReader = null;
            }
            return new b(i8, sb == null ? "" : sb.toString(), r11 != 0 ? r11.toString() : "");
        }
        return new b(-1, "", "");
    }
}
