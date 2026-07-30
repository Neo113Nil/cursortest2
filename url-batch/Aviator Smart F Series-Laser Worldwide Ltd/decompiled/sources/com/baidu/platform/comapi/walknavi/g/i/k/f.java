package com.baidu.platform.comapi.walknavi.g.i.k;

import android.os.Environment;
import android.text.TextUtils;
import cn.hutool.core.util.l;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static String f10076a;

    public static String a() {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("AR");
        sb.append("/ARResource");
        sb.append(str);
        sb.append(b());
        return sb.toString();
    }

    public static String b() {
        return f10076a;
    }

    public static void b(String str) {
        f10076a = str;
    }

    public static void b(String str, String str2) {
        OutputStreamWriter outputStreamWriter;
        FileOutputStream fileOutputStream;
        BufferedWriter bufferedWriter;
        File file = new File(a());
        if (!file.exists()) {
            file.mkdirs();
        }
        String str3 = a() + File.separator + str2;
        File file2 = new File(str3);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException unused) {
            }
        }
        if (a(str, str2)) {
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(str3, true);
                try {
                    outputStreamWriter = new OutputStreamWriter(fileOutputStream, l.UTF_8);
                    try {
                        bufferedWriter = new BufferedWriter(outputStreamWriter);
                    } catch (FileNotFoundException unused2) {
                    } catch (UnsupportedEncodingException unused3) {
                    } catch (IOException unused4) {
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (FileNotFoundException unused5) {
                    outputStreamWriter = null;
                } catch (UnsupportedEncodingException unused6) {
                    outputStreamWriter = null;
                } catch (IOException unused7) {
                    outputStreamWriter = null;
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = null;
                }
                try {
                    bufferedWriter.write(str);
                    bufferedWriter.newLine();
                    bufferedWriter.close();
                    outputStreamWriter.close();
                    fileOutputStream.close();
                } catch (FileNotFoundException unused8) {
                    bufferedWriter2 = bufferedWriter;
                    if (bufferedWriter2 != null) {
                        bufferedWriter2.close();
                    }
                    if (outputStreamWriter != null) {
                        outputStreamWriter.close();
                    }
                    if (fileOutputStream == null) {
                        return;
                    }
                    fileOutputStream.close();
                } catch (UnsupportedEncodingException unused9) {
                    bufferedWriter2 = bufferedWriter;
                    if (bufferedWriter2 != null) {
                        bufferedWriter2.close();
                    }
                    if (outputStreamWriter != null) {
                        outputStreamWriter.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (IOException unused10) {
                    bufferedWriter2 = bufferedWriter;
                    if (bufferedWriter2 != null) {
                        bufferedWriter2.close();
                    }
                    if (outputStreamWriter != null) {
                        outputStreamWriter.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedWriter2 = bufferedWriter;
                    if (bufferedWriter2 != null) {
                        try {
                            bufferedWriter2.close();
                        } catch (IOException unused11) {
                            throw th;
                        }
                    }
                    if (outputStreamWriter != null) {
                        outputStreamWriter.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (IOException unused12) {
            }
        } catch (FileNotFoundException unused13) {
            outputStreamWriter = null;
            fileOutputStream = null;
        } catch (UnsupportedEncodingException unused14) {
            outputStreamWriter = null;
            fileOutputStream = null;
        } catch (IOException unused15) {
            outputStreamWriter = null;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            outputStreamWriter = null;
            fileOutputStream = null;
        }
    }

    public static String a(String str, int i8) {
        String str2;
        String a8 = a();
        if (a8 == null) {
            str2 = null;
        } else if (i8 == 0) {
            str2 = a8 + "/track";
        } else if (i8 == 2) {
            str2 = a8 + "/track";
        } else if (i8 == 3) {
            str2 = a8 + "/udt";
        } else if (i8 != 4) {
            str2 = a8 + "/normal";
        } else {
            str2 = a8 + "/npc";
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + File.separator + str;
    }

    public static boolean a(File file) {
        String[] list;
        if (file.isDirectory() && (list = file.list()) != null) {
            for (String str : list) {
                if (!a(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static boolean a(String str, String str2) {
        HashSet<String> a8 = a(a() + File.separator + str2);
        if (a8 == null) {
            return false;
        }
        Iterator<String> it = a8.iterator();
        while (it.hasNext()) {
            String next = it.next();
            boolean equals = str.equals(next);
            a.a("item = " + next + ", key = " + str + ", result = " + equals);
            if (equals) {
                return true;
            }
        }
        return false;
    }

    private static HashSet<String> a(String str) {
        Throwable th;
        InputStreamReader inputStreamReader;
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        HashSet<String> hashSet = new HashSet<>();
        BufferedReader bufferedReader2 = null;
        if (!new File(str).exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(str);
            try {
                inputStreamReader = new InputStreamReader(fileInputStream, l.UTF_8);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                hashSet.add(readLine);
                            } else {
                                try {
                                    break;
                                } catch (IOException unused) {
                                }
                            }
                        } catch (FileNotFoundException unused2) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused3) {
                                    return null;
                                }
                            }
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return null;
                        } catch (IOException unused4) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused5) {
                                    return null;
                                }
                            }
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException unused6) {
                                    throw th;
                                }
                            }
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            throw th;
                        }
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    fileInputStream.close();
                    a.a("keysSet size is " + hashSet.size());
                    return hashSet;
                } catch (FileNotFoundException unused7) {
                    bufferedReader = null;
                } catch (IOException unused8) {
                    bufferedReader = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (FileNotFoundException unused9) {
                inputStreamReader = null;
                bufferedReader = null;
            } catch (IOException unused10) {
                inputStreamReader = null;
                bufferedReader = null;
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader = null;
            }
        } catch (FileNotFoundException unused11) {
            inputStreamReader = null;
            fileInputStream = null;
            bufferedReader = null;
        } catch (IOException unused12) {
            inputStreamReader = null;
            fileInputStream = null;
            bufferedReader = null;
        } catch (Throwable th5) {
            th = th5;
            inputStreamReader = null;
            fileInputStream = null;
        }
    }
}
