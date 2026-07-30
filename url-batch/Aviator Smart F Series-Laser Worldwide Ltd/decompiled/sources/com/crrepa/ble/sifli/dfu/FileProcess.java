package com.crrepa.ble.sifli.dfu;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.crrepa.ble.sifli.dfu.constants.General;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes3.dex */
public class FileProcess {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "dfuFileProcess";

    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean LoadListFile(ArrayList<OTAFile> arrayList, Context context) {
        OTAFile oTAFile;
        int i8;
        String str;
        Iterator<OTAFile> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                oTAFile = null;
                break;
            }
            oTAFile = it.next();
            if (oTAFile.getFileName().equals(General.OTA_LIST_FILE_NAME)) {
                break;
            }
        }
        if (oTAFile == null) {
            str = "fail to find list file";
        } else {
            oTAFile.setFileIndex(1);
            try {
                FileOutputStream openFileOutput = context.openFileOutput("temp_list.txt", 0);
                openFileOutput.write(oTAFile.getFileData());
                openFileOutput.close();
                FileInputStream openFileInput = context.openFileInput("temp_list.txt");
                DataInputStream dataInputStream = new DataInputStream(openFileInput);
                int i9 = 2;
                i8 = 1;
                while (true) {
                    try {
                        String readLine = dataInputStream.readLine();
                        if (readLine == null) {
                            break;
                        }
                        int lastIndexOf = readLine.lastIndexOf("/");
                        if (lastIndexOf != -1) {
                            String substring = readLine.substring(lastIndexOf + 1);
                            Iterator<OTAFile> it2 = arrayList.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    OTAFile next = it2.next();
                                    if (next.getFileName().equals(substring)) {
                                        next.setFileIndex(i9);
                                        i8++;
                                        break;
                                    }
                                }
                            }
                        }
                        i9++;
                    } catch (FileNotFoundException e8) {
                        e = e8;
                        e.printStackTrace();
                        if (arrayList.size() == i8) {
                        }
                    } catch (IOException e9) {
                        e = e9;
                        e.printStackTrace();
                        if (arrayList.size() == i8) {
                        }
                    }
                }
                dataInputStream.close();
                openFileInput.close();
            } catch (FileNotFoundException | IOException e10) {
                e = e10;
                i8 = 1;
            }
            if (arrayList.size() == i8) {
                return true;
            }
            str = "list file process error, size " + arrayList.size() + ", count " + i8;
        }
        Log.e(TAG, str);
        return false;
    }

    public static void copyFile(Context context, Uri uri, File file) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            copyStream(openInputStream, fileOutputStream);
            openInputStream.close();
            fileOutputStream.close();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static int copyStream(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[2048];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 2048);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 2048);
        int i8 = 0;
        while (true) {
            try {
                int read = bufferedInputStream.read(bArr, 0, 2048);
                if (read == -1) {
                    break;
                }
                bufferedOutputStream.write(bArr, 0, read);
                i8 += read;
            } finally {
            }
        }
        bufferedOutputStream.flush();
        try {
            bufferedOutputStream.close();
        } catch (IOException e8) {
            Log.e(TAG, "out close error", e8);
        }
        try {
            bufferedInputStream.close();
        } catch (IOException e9) {
            Log.e(TAG, "in close error", e9);
        }
        return i8;
    }

    public static void deleteFolderFile(String str, boolean z7) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                deleteFolderFile(file2.getAbsolutePath(), true);
            }
        }
        if (z7) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                Objects.requireNonNull(listFiles);
                if (listFiles.length != 0) {
                    return;
                }
            }
            file.delete();
        }
    }

    public static String getFileName(Uri uri) {
        String path;
        int lastIndexOf;
        if (uri == null || (lastIndexOf = (path = uri.getPath()).lastIndexOf(47)) == -1) {
            return null;
        }
        return path.substring(lastIndexOf + 1);
    }

    public static String getFilePathFromURI(Context context, Uri uri) {
        File externalFilesDir = context.getExternalFilesDir(null);
        String fileName = getFileName(uri);
        if (TextUtils.isEmpty(fileName)) {
            return null;
        }
        File file = new File(externalFilesDir + File.separator + fileName);
        copyFile(context, uri, file);
        return file.getAbsolutePath();
    }

    public static int getFileSize(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            int available = fileInputStream.available();
            fileInputStream.close();
            return available;
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static ArrayList<OTAFile> getImageFile(ArrayList<DFUImagePath> arrayList, Context context, int i8) {
        ArrayList<OTAFile> arrayList2 = new ArrayList<>();
        Iterator<DFUImagePath> it = arrayList.iterator();
        while (it.hasNext()) {
            DFUImagePath next = it.next();
            String imagePath = next.getImagePath();
            Uri imageUri = next.getImageUri();
            int imageType = next.getImageType();
            if (imageType >= -1) {
                if (imageUri != null) {
                    imagePath = getFilePathFromURI(context, imageUri);
                }
                Log.d(TAG, "image id " + imageType + ", md5: " + getMD5(imagePath));
                if (imagePath == null) {
                    return null;
                }
                OTAFile oTAFile = new OTAFile((i8 == 0 || imageType == -1) ? openFile(context, imagePath) : null, imageType);
                oTAFile.setFilePath(imagePath);
                arrayList2.add(oTAFile);
            }
        }
        return arrayList2;
    }

    public static String getMD5(String str) {
        int i8;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            StringBuffer stringBuffer = new StringBuffer();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            for (byte b8 : messageDigest.digest()) {
                stringBuffer.append(Integer.toString((b8 & 255) + 256, 16).substring(1));
            }
            return stringBuffer.toString().toLowerCase();
        } catch (IOException e8) {
            e = e8;
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e9) {
            e = e9;
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<OTAFile> getNandResFiles(String str, ArrayList<OTAFile> arrayList, String str2, Context context) {
        File[] listFiles;
        File file = new File(str);
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                String absolutePath = file2.getAbsolutePath();
                arrayList.add(new OTAFile(absolutePath.substring(str2.length()), openFile(context, absolutePath), file2.getName()));
            } else if (file2.isDirectory()) {
                getNandResFiles(file2.getAbsolutePath(), arrayList, str2, context);
            }
        }
        return arrayList;
    }

    public static byte[] openFile(Context context, String str) {
        File file = new File(str);
        byte[] bArr = new byte[0];
        context.getResources().getAssets();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.ISO_8859_1);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = bufferedReader.read();
                if (read == -1) {
                    bArr = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    bufferedReader.close();
                    inputStreamReader.close();
                    fileInputStream.close();
                    return bArr;
                }
                byteArrayOutputStream.write(read);
            }
        } catch (FileNotFoundException unused) {
            Log.e(TAG, str + " doesn't found!");
            return null;
        } catch (IOException e8) {
            Log.e(TAG, str + " read exception, " + e8.getMessage());
            e8.printStackTrace();
            return bArr;
        }
    }

    public static byte[] openFilePartly(Context context, String str, int i8, int i9) {
        File file = new File(str);
        byte[] bArr = new byte[i9];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.skip(i8);
            fileInputStream.read(bArr, 0, i9);
            fileInputStream.close();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        throw new java.lang.SecurityException("zip path have traversal characters path");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.io.InputStream, java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void unzipFolder(String str, String str2) {
        Throwable th;
        ?? r72;
        FileInputStream fileInputStream;
        String str3;
        Object obj;
        Object obj2;
        Object obj3;
        FileInputStream fileInputStream2 = null;
        ?? r02 = null;
        FileInputStream fileInputStream3 = null;
        FileInputStream fileInputStream4 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
                str3 = str;
                r02 = str3;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                if (r02 != null) {
                    throw th;
                }
                try {
                    r02.close();
                    throw th;
                } catch (IOException e9) {
                    e9.printStackTrace();
                    throw th;
                }
            }
            try {
                r72 = new ZipInputStream(fileInputStream);
            } catch (FileNotFoundException e10) {
                e = e10;
                obj3 = null;
            } catch (IOException e11) {
                e = e11;
                obj2 = null;
            } catch (Exception e12) {
                e = e12;
                obj = null;
            } catch (Throwable th3) {
                th = th3;
                if (fileInputStream != null) {
                }
                if (r02 != null) {
                }
            }
        } catch (FileNotFoundException e13) {
            e = e13;
            r72 = 0;
        } catch (IOException e14) {
            e = e14;
            r72 = 0;
        } catch (Exception e15) {
            e = e15;
            r72 = 0;
        } catch (Throwable th4) {
            th = th4;
            str = null;
            fileInputStream = null;
            str3 = str;
            r02 = str3;
            if (fileInputStream != null) {
            }
            if (r02 != null) {
            }
        }
        try {
            try {
                String canonicalPath = new File(str2).getCanonicalPath();
                while (true) {
                    ZipEntry nextEntry = r72.getNextEntry();
                    if (nextEntry != null) {
                        String name = nextEntry.getName();
                        if (!new File(canonicalPath, name).getCanonicalPath().startsWith(canonicalPath)) {
                            break;
                        }
                        if (nextEntry.isDirectory()) {
                            new File(canonicalPath + File.separator + name.substring(0, name.length() - 1)).mkdirs();
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(canonicalPath);
                            String str4 = File.separator;
                            sb.append(str4);
                            sb.append(name);
                            String sb2 = sb.toString();
                            File file = new File(sb2.substring(0, sb2.lastIndexOf(str4)));
                            if (!file.exists()) {
                                Log.w(TAG, "folder is null, mkdir now");
                                file.mkdirs();
                            }
                            File file2 = new File(canonicalPath + str4 + name);
                            file2.createNewFile();
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = r72.read(bArr);
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
                            fileInputStream.close();
                            break;
                        } catch (IOException e16) {
                            e16.printStackTrace();
                        }
                    }
                }
            } catch (FileNotFoundException e17) {
                e = e17;
                obj3 = r72;
                fileInputStream3 = fileInputStream;
                r72 = obj3;
                e.printStackTrace();
                if (fileInputStream3 != null) {
                    try {
                        fileInputStream3.close();
                    } catch (IOException e18) {
                        e18.printStackTrace();
                    }
                }
                if (r72 == 0) {
                    return;
                }
                r72.close();
            } catch (IOException e19) {
                e = e19;
                obj2 = r72;
                fileInputStream4 = fileInputStream;
                r72 = obj2;
                e.printStackTrace();
                if (fileInputStream4 != null) {
                    try {
                        fileInputStream4.close();
                    } catch (IOException e20) {
                        e20.printStackTrace();
                    }
                }
                if (r72 == 0) {
                    return;
                }
                r72.close();
            } catch (Exception e21) {
                e = e21;
                obj = r72;
                fileInputStream2 = fileInputStream;
                r72 = obj;
                e.printStackTrace();
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException e22) {
                        e22.printStackTrace();
                    }
                }
                if (r72 == 0) {
                    return;
                }
                r72.close();
            } catch (Throwable th5) {
                th = th5;
                str3 = r72;
                r02 = str3;
                if (fileInputStream != null) {
                }
                if (r02 != null) {
                }
            }
            r72.close();
        } catch (IOException e23) {
            e23.printStackTrace();
        }
    }
}
