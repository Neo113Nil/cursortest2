package cn.hutool.core.io;

import cn.hutool.core.map.h1;
import cn.hutool.core.util.g1;
import cn.hutool.core.util.z;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes.dex */
public class g {
    private static final Map<String, String> FILE_TYPE_MAP = new ConcurrentSkipListMap();

    public static String getType(String str) {
        Map<String, String> map = FILE_TYPE_MAP;
        if (h1.isNotEmpty(map)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (cn.hutool.core.text.l.startWithIgnoreCase(str, entry.getKey())) {
                    return entry.getValue();
                }
            }
        }
        return FileMagicNumber.getMagicNumber(z.decodeHex(str)).getExtension();
    }

    public static String getTypeByPath(String str, boolean z7) {
        return getType(l.file(str), z7);
    }

    public static String putFileType(String str, String str2) {
        return FILE_TYPE_MAP.put(str, str2);
    }

    public static String removeFileType(String str) {
        return FILE_TYPE_MAP.remove(str);
    }

    public static String getTypeByPath(String str) {
        return getTypeByPath(str, false);
    }

    public static String getType(InputStream inputStream, int i8) {
        return getType(n.readHex(inputStream, i8, false));
    }

    public static String getType(InputStream inputStream, boolean z7) {
        if (z7) {
            return getType(n.readHex8192Upper(inputStream));
        }
        return getType(n.readHex64Upper(inputStream));
    }

    public static String getType(InputStream inputStream) {
        return getType(inputStream, false);
    }

    public static String getType(InputStream inputStream, String str) {
        return getType(inputStream, str, false);
    }

    public static String getType(InputStream inputStream, String str, boolean z7) {
        String type = getType(inputStream, z7);
        if (type == null) {
            return l.extName(str);
        }
        String str2 = g1.URL_PROTOCOL_ZIP;
        if (g1.URL_PROTOCOL_ZIP.equals(type)) {
            String extName = l.extName(str);
            if (!"docx".equalsIgnoreCase(extName)) {
                if (!"xlsx".equalsIgnoreCase(extName)) {
                    if (!"pptx".equalsIgnoreCase(extName)) {
                        if (g1.URL_PROTOCOL_JAR.equalsIgnoreCase(extName)) {
                            return g1.URL_PROTOCOL_JAR;
                        }
                        str2 = "war";
                        if (!"war".equalsIgnoreCase(extName)) {
                            str2 = "ofd";
                            if (!"ofd".equalsIgnoreCase(extName)) {
                                if (!"apk".equalsIgnoreCase(extName)) {
                                    return type;
                                }
                                return "apk";
                            }
                        }
                        return str2;
                    }
                    return "pptx";
                }
                return "xlsx";
            }
            return "docx";
        }
        if (!g1.URL_PROTOCOL_JAR.equals(type)) {
            return type;
        }
        String extName2 = l.extName(str);
        if (!"xlsx".equalsIgnoreCase(extName2)) {
            if (!"docx".equalsIgnoreCase(extName2)) {
                if (!"pptx".equalsIgnoreCase(extName2)) {
                    if (!g1.URL_PROTOCOL_ZIP.equalsIgnoreCase(extName2)) {
                        if (!"apk".equalsIgnoreCase(extName2)) {
                            return type;
                        }
                        return "apk";
                    }
                    return str2;
                }
                return "pptx";
            }
            return "docx";
        }
        return "xlsx";
    }

    public static String getType(File file, boolean z7) {
        FileInputStream fileInputStream;
        if (l.isFile(file)) {
            try {
                fileInputStream = n.toStream(file);
                try {
                    String type = getType(fileInputStream, file.getName(), z7);
                    n.close((Closeable) fileInputStream);
                    return type;
                } catch (Throwable th) {
                    th = th;
                    n.close((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
        } else {
            throw new IllegalArgumentException("Not a regular file!");
        }
    }

    public static String getType(File file) {
        return getType(file, false);
    }
}
