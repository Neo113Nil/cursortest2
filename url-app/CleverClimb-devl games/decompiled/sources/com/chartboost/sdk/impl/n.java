package com.chartboost.sdk.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class n {
    /* JADX WARN: Removed duplicated region for block: B:76:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(File file, Map<String, String> map) throws Exception {
        FileReader fileReader;
        BufferedReader bufferedReader;
        int max;
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader(file);
            try {
                bufferedReader = new BufferedReader(fileReader);
                try {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        if (key.startsWith("{{") || key.startsWith("{%")) {
                            hashMap.put(key, entry.getValue());
                        }
                    }
                    Set<Map.Entry> entrySet = hashMap.entrySet();
                    Iterator it = entrySet.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        i += ((String) ((Map.Entry) it.next()).getValue()).length() * 3;
                    }
                    StringBuilder sb = new StringBuilder(((int) file.length()) + i);
                    StringBuilder sb2 = new StringBuilder(2048);
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        int indexOf = readLine.indexOf("{{");
                        int indexOf2 = readLine.indexOf("{%");
                        if (indexOf != -1 && indexOf2 != -1) {
                            max = Math.min(indexOf, indexOf2);
                        } else {
                            max = Math.max(indexOf, indexOf2);
                        }
                        if (max == -1) {
                            sb.append(readLine);
                        } else {
                            sb2.setLength(0);
                            sb2.append(readLine);
                            for (Map.Entry entry2 : entrySet) {
                                String str = (String) entry2.getKey();
                                String str2 = (String) entry2.getValue();
                                int length = str.length();
                                while (true) {
                                    max = sb2.indexOf(str, max);
                                    if (-1 != max) {
                                        sb2.replace(max, max + length, str2);
                                        max += str2.length();
                                    }
                                }
                            }
                            sb.append((CharSequence) sb2);
                        }
                        sb.append("\n");
                    }
                    String sb3 = sb.toString();
                    if (sb3.contains("{{")) {
                        throw new IllegalArgumentException("Missing required template parameter");
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException unused) {
                    }
                    try {
                        fileReader.close();
                    } catch (IOException unused2) {
                    }
                    return sb3;
                } catch (OutOfMemoryError e) {
                    e = e;
                    fileReader2 = fileReader;
                    try {
                        throw new Exception(e);
                    } catch (Throwable th) {
                        th = th;
                        fileReader = fileReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (fileReader == null) {
                            try {
                                fileReader.close();
                                throw th;
                            } catch (IOException unused4) {
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                    }
                    if (fileReader == null) {
                    }
                }
            } catch (OutOfMemoryError e2) {
                e = e2;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (OutOfMemoryError e3) {
            e = e3;
            bufferedReader = null;
        } catch (Throwable th4) {
            th = th4;
            fileReader = null;
            bufferedReader = null;
        }
    }
}
