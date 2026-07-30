package com.artillery.ctc.uitls;

import android.util.Log;
import androidx.annotation.Keep;
import com.github.mikephil.charting.utils.i;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public final class FileIOUtils {
    private static int sBufferSize = 524288;

    public interface a {
        void a(double d8);
    }

    private FileIOUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static byte[] readFile2BytesByChannel(String str) {
        return readFile2BytesByChannel(FileUtils.getFileByPath(str));
    }

    public static byte[] readFile2BytesByMap(String str) {
        return readFile2BytesByMap(FileUtils.getFileByPath(str));
    }

    public static byte[] readFile2BytesByStream(String str) {
        return readFile2BytesByStream(FileUtils.getFileByPath(str), (a) null);
    }

    public static List<String> readFile2List(String str) {
        return readFile2List(FileUtils.getFileByPath(str), (String) null);
    }

    public static String readFile2String(String str) {
        return readFile2String(FileUtils.getFileByPath(str), (String) null);
    }

    public static void setBufferSize(int i8) {
        sBufferSize = i8;
    }

    public static boolean writeFileFromBytesByChannel(String str, byte[] bArr, boolean z7) {
        return writeFileFromBytesByChannel(FileUtils.getFileByPath(str), bArr, false, z7);
    }

    public static boolean writeFileFromBytesByMap(String str, byte[] bArr, boolean z7) {
        return writeFileFromBytesByMap(str, bArr, false, z7);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr) {
        return writeFileFromBytesByStream(FileUtils.getFileByPath(str), bArr, false, (a) null);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream) {
        return writeFileFromIS(FileUtils.getFileByPath(str), inputStream, false, (a) null);
    }

    public static boolean writeFileFromString(String str, String str2) {
        return writeFileFromString(FileUtils.getFileByPath(str), str2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    public static byte[] readFile2BytesByChannel(File file) {
        FileChannel fileChannel;
        ?? r12 = 0;
        try {
            if (!FileUtils.isFileExists(file)) {
                return null;
            }
            try {
                fileChannel = new RandomAccessFile(file, "r").getChannel();
                try {
                    if (fileChannel == null) {
                        Log.e("FileIOUtils", "fc is null.");
                        byte[] bArr = new byte[0];
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                        }
                        return bArr;
                    }
                    ByteBuffer allocate = ByteBuffer.allocate((int) fileChannel.size());
                    while (fileChannel.read(allocate) > 0) {
                    }
                    byte[] array = allocate.array();
                    try {
                        fileChannel.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                    return array;
                } catch (IOException e10) {
                    e = e10;
                    e.printStackTrace();
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (IOException e12) {
                e = e12;
                fileChannel = null;
            } catch (Throwable th) {
                th = th;
                if (r12 != 0) {
                    try {
                        r12.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r12 = file;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    public static byte[] readFile2BytesByMap(File file) {
        FileChannel fileChannel;
        ?? r12 = 0;
        try {
            if (!FileUtils.isFileExists(file)) {
                return null;
            }
            try {
                fileChannel = new RandomAccessFile(file, "r").getChannel();
                try {
                    if (fileChannel == null) {
                        Log.e("FileIOUtils", "fc is null.");
                        byte[] bArr = new byte[0];
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                        }
                        return bArr;
                    }
                    int size = (int) fileChannel.size();
                    byte[] bArr2 = new byte[size];
                    fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, size).load().get(bArr2, 0, size);
                    try {
                        fileChannel.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                    return bArr2;
                } catch (IOException e10) {
                    e = e10;
                    e.printStackTrace();
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (IOException e12) {
                e = e12;
                fileChannel = null;
            } catch (Throwable th) {
                th = th;
                if (r12 != 0) {
                    try {
                        r12.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r12 = file;
        }
    }

    public static byte[] readFile2BytesByStream(File file) {
        return readFile2BytesByStream(file, (a) null);
    }

    public static List<String> readFile2List(String str, String str2) {
        return readFile2List(FileUtils.getFileByPath(str), str2);
    }

    public static String readFile2String(String str, String str2) {
        return readFile2String(FileUtils.getFileByPath(str), str2);
    }

    public static boolean writeFileFromBytesByChannel(String str, byte[] bArr, boolean z7, boolean z8) {
        return writeFileFromBytesByChannel(FileUtils.getFileByPath(str), bArr, z7, z8);
    }

    public static boolean writeFileFromBytesByMap(String str, byte[] bArr, boolean z7, boolean z8) {
        return writeFileFromBytesByMap(FileUtils.getFileByPath(str), bArr, z7, z8);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr, boolean z7) {
        return writeFileFromBytesByStream(FileUtils.getFileByPath(str), bArr, z7, (a) null);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream, boolean z7) {
        return writeFileFromIS(FileUtils.getFileByPath(str), inputStream, z7, (a) null);
    }

    public static boolean writeFileFromString(String str, String str2, boolean z7) {
        return writeFileFromString(FileUtils.getFileByPath(str), str2, z7);
    }

    public static byte[] readFile2BytesByStream(String str, a aVar) {
        return readFile2BytesByStream(FileUtils.getFileByPath(str), aVar);
    }

    public static List<String> readFile2List(File file) {
        return readFile2List(file, 0, Integer.MAX_VALUE, (String) null);
    }

    public static String readFile2String(File file) {
        return readFile2String(file, (String) null);
    }

    public static boolean writeFileFromBytesByChannel(File file, byte[] bArr, boolean z7) {
        return writeFileFromBytesByChannel(file, bArr, false, z7);
    }

    public static boolean writeFileFromBytesByMap(File file, byte[] bArr, boolean z7) {
        return writeFileFromBytesByMap(file, bArr, false, z7);
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr) {
        return writeFileFromBytesByStream(file, bArr, false, (a) null);
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream) {
        return writeFileFromIS(file, inputStream, false, (a) null);
    }

    public static boolean writeFileFromString(File file, String str) {
        return writeFileFromString(file, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[Catch: FileNotFoundException -> 0x0063, SYNTHETIC, TRY_LEAVE, TryCatch #4 {FileNotFoundException -> 0x0063, blocks: (B:6:0x0008, B:25:0x005f, B:27:0x0057, B:61:0x0093, B:60:0x0090, B:65:0x0086, B:45:0x007d, B:48:0x0073, B:53:0x0081, B:18:0x0052, B:38:0x006e, B:56:0x008b, B:21:0x005a, B:42:0x0078), top: B:5:0x0008, inners: #1, #2, #5, #6, #8, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] readFile2BytesByStream(File file, a aVar) {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        if (!FileUtils.isFileExists(file)) {
            return null;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), sBufferSize);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        byte[] bArr = new byte[sBufferSize];
                        if (aVar != null) {
                            double available = bufferedInputStream.available();
                            aVar.a(i.DOUBLE_EPSILON);
                            int i8 = 0;
                            while (true) {
                                int read = bufferedInputStream.read(bArr, 0, sBufferSize);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                                i8 += read;
                                aVar.a(i8 / available);
                            }
                        } else {
                            while (true) {
                                int read2 = bufferedInputStream.read(bArr, 0, sBufferSize);
                                if (read2 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read2);
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e9) {
                            e9.printStackTrace();
                        }
                        return byteArray;
                    } catch (IOException e10) {
                        e = e10;
                        e.printStackTrace();
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                    if (byteArrayOutputStream == null) {
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (IOException e14) {
                            e14.printStackTrace();
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (IOException e15) {
                e = e15;
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
                bufferedInputStream.close();
                if (byteArrayOutputStream == null) {
                }
            }
        } catch (FileNotFoundException e16) {
            e16.printStackTrace();
            return null;
        }
    }

    public static List<String> readFile2List(File file, String str) {
        return readFile2List(file, 0, Integer.MAX_VALUE, str);
    }

    public static String readFile2String(File file, String str) {
        byte[] readFile2BytesByStream = readFile2BytesByStream(file);
        if (readFile2BytesByStream == null) {
            return null;
        }
        if (StringUtils.isSpace(str)) {
            return new String(readFile2BytesByStream);
        }
        try {
            return new String(readFile2BytesByStream, str);
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static boolean writeFileFromBytesByChannel(File file, byte[] bArr, boolean z7, boolean z8) {
        if (bArr == null) {
            Log.e("FileIOUtils", "bytes is null.");
            return false;
        }
        if (!FileUtils.createOrExistsFile(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            try {
                FileChannel channel = new FileOutputStream(file, z7).getChannel();
                if (channel == null) {
                    Log.e("FileIOUtils", "fc is null.");
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    return false;
                }
                channel.position(channel.size());
                channel.write(ByteBuffer.wrap(bArr));
                if (z8) {
                    channel.force(true);
                }
                try {
                    channel.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
                return true;
            } catch (IOException e10) {
                e10.printStackTrace();
                if (0 != 0) {
                    try {
                        abstractInterruptibleChannel.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                return false;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    abstractInterruptibleChannel.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean writeFileFromBytesByMap(File file, byte[] bArr, boolean z7, boolean z8) {
        if (bArr != null && FileUtils.createOrExistsFile(file)) {
            AbstractInterruptibleChannel abstractInterruptibleChannel = null;
            try {
                try {
                    FileChannel channel = new FileOutputStream(file, z7).getChannel();
                    if (channel == null) {
                        Log.e("FileIOUtils", "fc is null.");
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                        }
                        return false;
                    }
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, channel.size(), bArr.length);
                    map.put(bArr);
                    if (z8) {
                        map.force();
                    }
                    try {
                        channel.close();
                        return true;
                    } catch (IOException e9) {
                        e9.printStackTrace();
                        return true;
                    }
                } catch (IOException e10) {
                    e10.printStackTrace();
                    if (0 != 0) {
                        try {
                            abstractInterruptibleChannel.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    return false;
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        abstractInterruptibleChannel.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                throw th;
            }
        }
        Log.e("FileIOUtils", "create file <" + file + "> failed.");
        return false;
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr, boolean z7) {
        return writeFileFromBytesByStream(file, bArr, z7, (a) null);
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream, boolean z7) {
        return writeFileFromIS(file, inputStream, z7, (a) null);
    }

    public static boolean writeFileFromString(File file, String str, boolean z7) {
        BufferedWriter bufferedWriter;
        if (file == null || str == null) {
            return false;
        }
        if (!FileUtils.createOrExistsFile(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file, z7));
            } catch (IOException e8) {
                e = e8;
            }
        } catch (Throwable th) {
            th = th;
            bufferedWriter = bufferedWriter2;
        }
        try {
            bufferedWriter.write(str);
            try {
                bufferedWriter.close();
                return true;
            } catch (IOException e9) {
                e9.printStackTrace();
                return true;
            }
        } catch (IOException e10) {
            e = e10;
            bufferedWriter2 = bufferedWriter;
            e.printStackTrace();
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static List<String> readFile2List(String str, int i8, int i9) {
        return readFile2List(FileUtils.getFileByPath(str), i8, i9, (String) null);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr, a aVar) {
        return writeFileFromBytesByStream(FileUtils.getFileByPath(str), bArr, false, aVar);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream, a aVar) {
        return writeFileFromIS(FileUtils.getFileByPath(str), inputStream, false, aVar);
    }

    public static List<String> readFile2List(String str, int i8, int i9, String str2) {
        return readFile2List(FileUtils.getFileByPath(str), i8, i9, str2);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr, boolean z7, a aVar) {
        return writeFileFromBytesByStream(FileUtils.getFileByPath(str), bArr, z7, aVar);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream, boolean z7, a aVar) {
        return writeFileFromIS(FileUtils.getFileByPath(str), inputStream, z7, aVar);
    }

    public static List<String> readFile2List(File file, int i8, int i9) {
        return readFile2List(file, i8, i9, (String) null);
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr, a aVar) {
        return writeFileFromBytesByStream(file, bArr, false, aVar);
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream, a aVar) {
        return writeFileFromIS(file, inputStream, false, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<String> readFile2List(File file, int i8, int i9, String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        if (!FileUtils.isFileExists(file) || i8 > i9) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int i10 = 1;
            if (StringUtils.isSpace(str)) {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            } else {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), str));
            }
            while (true) {
                try {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null && i10 <= i9) {
                            if (i8 <= i10 && i10 <= i9) {
                                arrayList.add(readLine);
                            }
                            i10++;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        e.printStackTrace();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e9) {
                                e9.printStackTrace();
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
            try {
                bufferedReader.close();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            return arrayList;
        } catch (IOException e12) {
            e = e12;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader2 != null) {
            }
            throw th;
        }
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr, boolean z7, a aVar) {
        if (bArr == null) {
            return false;
        }
        return writeFileFromIS(file, new ByteArrayInputStream(bArr), z7, aVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:9|(6:11|(2:12|(1:14)(0))|16|17|18|20)(6:28|(2:29|(1:31)(0))|16|17|18|20)|15|16|17|18|20) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        r7.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean writeFileFromIS(File file, InputStream inputStream, boolean z7, a aVar) {
        BufferedOutputStream bufferedOutputStream;
        if (inputStream != null && FileUtils.createOrExistsFile(file)) {
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, z7), sBufferSize);
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = null;
                }
            } catch (IOException e8) {
                e = e8;
            }
            try {
                try {
                    if (aVar == null) {
                        byte[] bArr = new byte[sBufferSize];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read != -1) {
                                bufferedOutputStream.write(bArr, 0, read);
                            }
                        }
                        inputStream.close();
                        bufferedOutputStream.close();
                        return true;
                    }
                    double available = inputStream.available();
                    aVar.a(i.DOUBLE_EPSILON);
                    byte[] bArr2 = new byte[sBufferSize];
                    int i8 = 0;
                    while (true) {
                        int read2 = inputStream.read(bArr2);
                        if (read2 != -1) {
                            bufferedOutputStream.write(bArr2, 0, read2);
                            i8 += read2;
                            aVar.a(i8 / available);
                        }
                    }
                    inputStream.close();
                    bufferedOutputStream.close();
                    return true;
                    bufferedOutputStream.close();
                    return true;
                } catch (IOException e9) {
                    e9.printStackTrace();
                    return true;
                }
                inputStream.close();
            } catch (IOException e10) {
                e = e10;
                bufferedOutputStream2 = bufferedOutputStream;
                e.printStackTrace();
                try {
                    inputStream.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                try {
                    inputStream.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                        throw th;
                    } catch (IOException e14) {
                        e14.printStackTrace();
                        throw th;
                    }
                }
                throw th;
            }
        } else {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
    }
}
