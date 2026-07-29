package com.tapjoy;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.aiming.mdt.utils.Constants;
import com.facebook.ads.AudienceNetworkActivity;
import com.umeng.commonsdk.proguard.ao;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import javax.xml.parsers.DocumentBuilderFactory;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes2.dex */
public class TapjoyUtil {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap f7787a = new HashMap();

    public static String SHA1(String str) {
        return a("SHA-1", str);
    }

    public static String SHA256(String str) {
        return a("SHA-256", str);
    }

    private static String a(String str, String str2) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(str2.getBytes("iso-8859-1"), 0, str2.length());
        return convertToHex(messageDigest.digest());
    }

    public static String convertToHex(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bArr.length; i++) {
            int i2 = (bArr[i] >>> 4) & 15;
            int i3 = 0;
            while (true) {
                if (i2 >= 0 && i2 <= 9) {
                    stringBuffer.append((char) (i2 + 48));
                } else {
                    stringBuffer.append((char) ((i2 - 10) + 97));
                }
                i2 = bArr[i] & ao.m;
                int i4 = i3 + 1;
                if (i3 > 0) {
                    break;
                }
                i3 = i4;
            }
        }
        return stringBuffer.toString();
    }

    public static Document buildDocument(String str) {
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(str.getBytes("UTF-8")));
        } catch (Exception e) {
            TapjoyLog.e("TapjoyUtil", "buildDocument exception: " + e.toString());
            return null;
        }
    }

    public static String getNodeTrimValue(NodeList nodeList) {
        Element element = (Element) nodeList.item(0);
        String str = "";
        if (element == null) {
            return null;
        }
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item != null) {
                str = str + item.getNodeValue();
            }
        }
        if (str == null || str.equals("")) {
            return null;
        }
        return str.trim();
    }

    public static void deleteFileOrDirectory(File file) {
        File[] listFiles;
        if (file == null) {
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                deleteFileOrDirectory(file2);
            }
        }
        TapjoyLog.d("TapjoyUtil", "****************************************");
        TapjoyLog.d("TapjoyUtil", "deleteFileOrDirectory: " + file.getAbsolutePath());
        TapjoyLog.d("TapjoyUtil", "****************************************");
        file.delete();
    }

    public static long fileOrDirectorySize(File file) {
        long fileOrDirectorySize;
        long j = 0;
        for (File file2 : file.listFiles()) {
            if (file2.isFile()) {
                fileOrDirectorySize = file2.length();
            } else {
                fileOrDirectorySize = fileOrDirectorySize(file2);
            }
            j += fileOrDirectorySize;
        }
        return j;
    }

    public static void writeFileToDevice(BufferedInputStream bufferedInputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static Bitmap createBitmapFromView(View view) {
        Bitmap createBitmap;
        Bitmap bitmap = null;
        if (view == null || view.getLayoutParams().width <= 0 || view.getLayoutParams().height <= 0) {
            return null;
        }
        try {
            createBitmap = Bitmap.createBitmap(view.getLayoutParams().width, view.getLayoutParams().height, Bitmap.Config.ARGB_8888);
        } catch (Exception e) {
            e = e;
        }
        try {
            Canvas canvas = new Canvas(createBitmap);
            view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            view.draw(canvas);
            return createBitmap;
        } catch (Exception e2) {
            e = e2;
            bitmap = createBitmap;
            TapjoyLog.d("TapjoyUtil", "error creating bitmap: " + e.toString());
            return bitmap;
        }
    }

    public static View scaleDisplayAd(View view, int i) {
        int i2 = view.getLayoutParams().width;
        int i3 = view.getLayoutParams().height;
        TapjoyLog.d("TapjoyUtil", "wxh: " + i2 + "x" + i3);
        if (i2 > i) {
            int intValue = Double.valueOf(Double.valueOf(Double.valueOf(i).doubleValue() / Double.valueOf(i2).doubleValue()).doubleValue() * 100.0d).intValue();
            WebView webView = (WebView) view;
            webView.getSettings().setSupportZoom(true);
            webView.setPadding(0, 0, 0, 0);
            webView.setVerticalScrollBarEnabled(false);
            webView.setHorizontalScrollBarEnabled(false);
            webView.setInitialScale(intValue);
            view.setLayoutParams(new ViewGroup.LayoutParams(i, (i3 * i) / i2));
        }
        return view;
    }

    public static void safePut(Map map, String str, String str2, boolean z) {
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            return;
        }
        if (z) {
            map.put(Uri.encode(str), Uri.encode(str2));
        } else {
            map.put(str, str2);
        }
    }

    public static void safePut(Map map, String str, Number number) {
        if (str == null || str.length() <= 0 || number == null) {
            return;
        }
        map.put(str, number.toString());
    }

    public static String convertURLParams(Map map, boolean z) {
        String str = "";
        for (Map.Entry entry : map.entrySet()) {
            if (str.length() > 0) {
                str = str + "&";
            }
            str = z ? str + Uri.encode((String) entry.getKey()) + "=" + Uri.encode((String) entry.getValue()) : str + ((String) entry.getKey()) + "=" + ((String) entry.getValue());
        }
        return str;
    }

    public static Map convertURLParams(String str, boolean z) {
        HashMap hashMap = new HashMap();
        String str2 = "";
        String str3 = "";
        boolean z2 = false;
        for (int i = 0; i < str.length() && i != -1; i++) {
            char charAt = str.charAt(i);
            if (z2) {
                if (z2) {
                    if (charAt == '&') {
                        if (z) {
                            str2 = Uri.decode(str2);
                        }
                        hashMap.put(str3, str2);
                        str2 = "";
                        z2 = false;
                    } else {
                        str2 = str2 + charAt;
                    }
                }
            } else if (charAt == '=') {
                if (z) {
                    str2 = Uri.decode(str2);
                }
                str3 = str2;
                str2 = "";
                z2 = true;
            } else {
                str2 = str2 + charAt;
            }
        }
        if (z2 && str2.length() > 0) {
            if (z) {
                str2 = Uri.decode(str2);
            }
            hashMap.put(str3, str2);
        }
        return hashMap;
    }

    public static String copyTextFromJarIntoString(String str) {
        return copyTextFromJarIntoString(str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap loadBitmapFromJar(String str, Context context) {
        Bitmap bitmap;
        InputStream inputStream;
        InputStream inputStream2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        byte[] bArr = (byte[]) getResource(str);
        InputStream inputStream3 = null;
        if (bArr != null) {
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            String str2 = "com/tapjoy/res/" + str;
            try {
                try {
                    URL resource = TapjoyUtil.class.getClassLoader().getResource(str2);
                    if (resource == null) {
                        AssetManager assets = context.getAssets();
                        InputStream open = assets.open(str2);
                        try {
                            BitmapFactory.decodeStream(open, null, options);
                            inputStream2 = assets.open(str2);
                        } catch (Exception e) {
                            e = e;
                            inputStream = open;
                            e.printStackTrace();
                            if (inputStream != null) {
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            inputStream3 = open;
                            if (inputStream3 != null) {
                                try {
                                    inputStream3.close();
                                } catch (IOException unused) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        String file = resource.getFile();
                        if (file.startsWith("jar:")) {
                            file = file.substring(4);
                        }
                        if (file.startsWith("file:")) {
                            file = file.substring(5);
                        }
                        int indexOf = file.indexOf("!");
                        if (indexOf > 0) {
                            file = file.substring(0, indexOf);
                        }
                        JarFile jarFile = new JarFile(file);
                        JarEntry jarEntry = jarFile.getJarEntry(str2);
                        inputStream = jarFile.getInputStream(jarEntry);
                        try {
                            BitmapFactory.decodeStream(inputStream, null, options);
                            inputStream2 = jarFile.getInputStream(jarEntry);
                        } catch (Exception e2) {
                            e = e2;
                            e.printStackTrace();
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                            return null;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream3 = context;
                }
            } catch (Exception e3) {
                e = e3;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                bitmap = BitmapFactory.decodeStream(inputStream2);
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Exception e4) {
                inputStream = inputStream2;
                e = e4;
                e.printStackTrace();
                if (inputStream != null) {
                }
                return null;
            } catch (Throwable th4) {
                inputStream3 = inputStream2;
                th = th4;
                if (inputStream3 != null) {
                }
                throw th;
            }
        }
        float deviceScreenDensityScale = TapjoyConnectCore.getDeviceScreenDensityScale();
        return bitmap != null ? Bitmap.createScaledBitmap(bitmap, (int) (options.outWidth * deviceScreenDensityScale), (int) (options.outHeight * deviceScreenDensityScale), true) : bitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String copyTextFromJarIntoString(String str, Context context) {
        InputStream inputStream;
        InputStream inputStream2;
        byte[] bArr = new byte[1024];
        StringBuffer stringBuffer = new StringBuffer();
        URL resource = TapjoyUtil.class.getClassLoader().getResource(str);
        InputStream inputStream3 = null;
        try {
            if (context != null && resource == null) {
                inputStream2 = context.getAssets().open(str);
            } else {
                String file = resource.getFile();
                if (file.startsWith("jar:")) {
                    file = file.substring(4);
                }
                if (file.startsWith("file:")) {
                    file = file.substring(5);
                }
                int indexOf = file.indexOf("!");
                if (indexOf > 0) {
                    file = file.substring(0, indexOf);
                }
                JarFile jarFile = new JarFile(file);
                inputStream2 = jarFile.getInputStream(jarFile.getJarEntry(str));
            }
            while (true) {
                try {
                    int read = inputStream2.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    stringBuffer.append(new String(bArr).substring(0, read));
                } catch (Exception e) {
                    inputStream = inputStream2;
                    e = e;
                    try {
                        TapjoyLog.d("TapjoyUtil", "file exception: " + e.toString());
                        e.printStackTrace();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception unused) {
                            }
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        inputStream3 = inputStream;
                        if (inputStream3 != null) {
                            try {
                                inputStream3.close();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    inputStream3 = inputStream2;
                    th = th2;
                    if (inputStream3 != null) {
                    }
                    throw th;
                }
            }
            String stringBuffer2 = stringBuffer.toString();
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (Exception unused3) {
                }
            }
            return stringBuffer2;
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void setResource(String str, Object obj) {
        f7787a.put(str, obj);
    }

    public static Object getResource(String str) {
        return f7787a.get(str);
    }

    public static String getRedirectDomain(String str) {
        return str != null ? str.substring(str.indexOf("//") + 2, str.lastIndexOf("/")) : "";
    }

    public static String determineMimeType(String str) {
        if (str.endsWith(".")) {
            str = str.substring(0, str.length() - 1);
        }
        String substring = str.lastIndexOf(46) != -1 ? str.substring(str.lastIndexOf(46) + 1) : "";
        return substring.equals("css") ? "text/css" : substring.equals("js") ? "text/javascript" : substring.equals("html") ? AudienceNetworkActivity.WEBVIEW_MIME_TYPE : Constants.CONTENT_TYPE_STREAM;
    }

    public static Map jsonToStringMap(JSONObject jSONObject) {
        return jSONObject != JSONObject.NULL ? toStringMap(jSONObject) : new HashMap();
    }

    public static Map toStringMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.get(next).toString());
        }
        return hashMap;
    }

    public static void runOnMainThread(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public static String getFileContents(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (!z) {
            String readLine = bufferedReader.readLine();
            boolean z2 = readLine == null;
            if (readLine != null) {
                sb.append(readLine);
            }
            z = z2;
        }
        bufferedReader.close();
        fileInputStream.close();
        return sb.toString();
    }
}
