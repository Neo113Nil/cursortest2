package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fat extends fbt {
    private final Context a;
    private final fbs b;
    private final fbs c;
    private final Object d = new Object();
    private volatile String e;

    /* JADX WARN: Type inference failed for: r3v1, types: [fbs, java.lang.Object] */
    public fat(gwh gwhVar) {
        this.b = new faw((fbc) gwhVar.a);
        this.a = (Context) gwhVar.b;
        this.c = gwhVar.c;
    }

    private final void k() {
        if (this.c == null) {
            throw new faz("Android backend cannot perform remote operations without a remote backend");
        }
    }

    private final boolean l(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010f  */
    @Override // defpackage.fbt, defpackage.fbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final File b(Uri uri) {
        File externalFilesDir;
        Account account;
        Context createDeviceProtectedStorageContext;
        Context context;
        Context createDeviceProtectedStorageContext2;
        Context createDeviceProtectedStorageContext3;
        if (l(uri)) {
            throw new IOException("operation is not permitted in other authorities.");
        }
        Context context2 = this.a;
        if (!uri.getScheme().equals("android")) {
            throw new fbd("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new fbd(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new fbd("Did not expect uri to have query");
        }
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        String str = (String) arrayList.get(0);
        switch (str.hashCode()) {
            case -1820761141:
                if (str.equals("external")) {
                    externalFilesDir = context2.getExternalFilesDir(null);
                    File file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    context = this.a;
                    if (!djl.i(context)) {
                        String str2 = this.e;
                        if (str2 == null) {
                            synchronized (this.d) {
                                str2 = this.e;
                                if (str2 == null) {
                                    createDeviceProtectedStorageContext2 = context.createDeviceProtectedStorageContext();
                                    String absolutePath = exf.i(createDeviceProtectedStorageContext2).getParentFile().getAbsolutePath();
                                    this.e = absolutePath;
                                    str2 = absolutePath;
                                }
                            }
                        }
                        if (!file.getAbsolutePath().startsWith(str2)) {
                            throw new faz("Cannot access credential-protected data from direct boot");
                        }
                    }
                    return file;
                }
                throw new fbd(String.format("Path must start with a valid logical location: %s", uri));
            case 94416770:
                if (str.equals("cache")) {
                    externalFilesDir = context2.getCacheDir();
                    File file2 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    context = this.a;
                    if (!djl.i(context)) {
                    }
                    return file2;
                }
                throw new fbd(String.format("Path must start with a valid logical location: %s", uri));
            case 97434231:
                if (str.equals("files")) {
                    externalFilesDir = exf.i(context2);
                    File file22 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    context = this.a;
                    if (!djl.i(context)) {
                    }
                    return file22;
                }
                throw new fbd(String.format("Path must start with a valid logical location: %s", uri));
            case 835260319:
                if (str.equals("managed")) {
                    File file3 = new File(exf.i(context2), "managed");
                    if (arrayList.size() >= 3) {
                        try {
                            String str3 = (String) arrayList.get(2);
                            Account account2 = fas.a;
                            if ("shared".equals(str3)) {
                                account = fas.a;
                            } else {
                                int indexOf = str3.indexOf(58);
                                exf.o(indexOf >= 0, "Malformed account", new Object[0]);
                                account = new Account(str3.substring(indexOf + 1), str3.substring(0, indexOf));
                            }
                            if (!fas.b(account)) {
                                throw new fbd("AccountManager cannot be null");
                            }
                        } catch (IllegalArgumentException e) {
                            throw new fbd(e);
                        }
                    }
                    externalFilesDir = file3;
                    File file222 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    context = this.a;
                    if (!djl.i(context)) {
                    }
                    return file222;
                }
                throw new fbd(String.format("Path must start with a valid logical location: %s", uri));
            case 988548496:
                if (str.equals("directboot-cache")) {
                    createDeviceProtectedStorageContext = context2.createDeviceProtectedStorageContext();
                    externalFilesDir = createDeviceProtectedStorageContext.getCacheDir();
                    File file2222 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    context = this.a;
                    if (!djl.i(context)) {
                    }
                    return file2222;
                }
                throw new fbd(String.format("Path must start with a valid logical location: %s", uri));
            case 991565957:
                if (str.equals("directboot-files")) {
                    createDeviceProtectedStorageContext3 = context2.createDeviceProtectedStorageContext();
                    externalFilesDir = createDeviceProtectedStorageContext3.getFilesDir();
                    File file22222 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    context = this.a;
                    if (!djl.i(context)) {
                    }
                    return file22222;
                }
                throw new fbd(String.format("Path must start with a valid logical location: %s", uri));
            default:
                throw new fbd(String.format("Path must start with a valid logical location: %s", uri));
        }
    }

    @Override // defpackage.fbt, defpackage.fbs
    public final InputStream c(Uri uri) {
        if (!l(uri)) {
            return this.b.c(i(uri));
        }
        k();
        return this.c.c(uri);
    }

    @Override // defpackage.fbs
    public final String e() {
        return "android";
    }

    @Override // defpackage.fbt, defpackage.fbs
    public final boolean h(Uri uri) {
        if (!l(uri)) {
            return this.b.h(i(uri));
        }
        k();
        return this.c.h(uri);
    }

    @Override // defpackage.fbt
    protected final Uri i(Uri uri) {
        if (l(uri)) {
            throw new fbd("Operation across authorities is not allowed.");
        }
        File b = b(uri);
        Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
        int i = hel.d;
        heg hegVar = new heg(4);
        path.path(b.getAbsolutePath());
        return path.encodedFragment(fbm.a(hegVar.g())).build();
    }

    @Override // defpackage.fbt
    protected final fbs j() {
        return this.b;
    }
}
