package androidx.core.content;

import android.content.ContentProvider;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class b extends ContentProvider {

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f505f = {"_display_name", "_size"};

    /* renamed from: g, reason: collision with root package name */
    private static final File f506g = new File("/");

    /* renamed from: h, reason: collision with root package name */
    private static HashMap<String, a> f507h = new HashMap<>();

    interface a {
        Uri a(File file);
    }

    /* renamed from: androidx.core.content.b$b, reason: collision with other inner class name */
    static class C0011b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final String f508a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap<String, File> f509b = new HashMap<>();

        C0011b(String str) {
            this.f508a = str;
        }

        @Override // androidx.core.content.b.a
        public Uri a(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f509b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = entry.getValue().getPath();
                boolean endsWith = path2.endsWith("/");
                int length = path2.length();
                if (!endsWith) {
                    length++;
                }
                return new Uri.Builder().scheme("content").authority(this.f508a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(canonicalPath.substring(length), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        void b(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f509b.put(str, file.getCanonicalFile());
            } catch (IOException e7) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e7);
            }
        }
    }

    private static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static a b(Context context, String str) {
        a aVar;
        synchronized (f507h) {
            aVar = f507h.get(str);
            if (aVar == null) {
                try {
                    aVar = d(context, str);
                    f507h.put(str, aVar);
                } catch (IOException e7) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e7);
                } catch (XmlPullParserException e8) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e8);
                }
            }
        }
        return aVar;
    }

    public static Uri c(Context context, String str, File file) {
        return b(context, str).a(file);
    }

    private static a d(Context context, String str) {
        C0011b c0011b = new C0011b(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = loadXmlMetaData.next();
            if (next == 1) {
                return c0011b;
            }
            if (next == 2) {
                String name = loadXmlMetaData.getName();
                File file = null;
                String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = f506g;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] b7 = androidx.core.content.a.b(context, null);
                    if (b7.length > 0) {
                        file = b7[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] a7 = androidx.core.content.a.a(context);
                    if (a7.length > 0) {
                        file = a7[0];
                    }
                } else if (Build.VERSION.SDK_INT >= 21 && "external-media-path".equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        file = externalMediaDirs[0];
                    }
                }
                if (file != null) {
                    c0011b.b(attributeValue, a(file, attributeValue2));
                }
            }
        }
    }
}
