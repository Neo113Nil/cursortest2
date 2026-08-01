package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class be implements oe {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2170a;

    /* renamed from: d, reason: collision with root package name */
    public String f2173d;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2172c = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ee f2171b = new ee();

    public be(ta taVar) {
        this.f2170a = taVar.f2823e;
    }

    @Override // com.google.android.gms.internal.measurement.oe
    public final he a(Uri uri) {
        if (i(uri)) {
            throw new ge("Android backend cannot perform remote operations without a remote backend");
        }
        File b10 = ia.b(h(uri));
        return new he(new FileInputStream(b10), b10);
    }

    @Override // com.google.android.gms.internal.measurement.oe
    public final boolean b(Uri uri) {
        if (i(uri)) {
            throw new ge("Android backend cannot perform remote operations without a remote backend");
        }
        return ia.b(h(uri)).exists();
    }

    @Override // com.google.android.gms.internal.measurement.oe
    public final OutputStream c(Uri uri) {
        return this.f2171b.c(h(uri));
    }

    @Override // com.google.android.gms.internal.measurement.oe
    public final void d(Uri uri) {
        this.f2171b.d(h(uri));
    }

    @Override // com.google.android.gms.internal.measurement.oe
    public final void e(Uri uri, Uri uri2) {
        this.f2171b.e(h(uri), h(uri2));
    }

    @Override // com.google.android.gms.internal.measurement.oe
    public final String f() {
        return "android";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0110  */
    @Override // com.google.android.gms.internal.measurement.oe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final File g(Uri uri) {
        File externalFilesDir;
        Account account;
        String str;
        if (i(uri)) {
            throw new IOException("operation is not permitted in other authorities.");
        }
        Context context = this.f2170a;
        if (!uri.getScheme().equals("android")) {
            throw new androidx.datastore.preferences.protobuf.k("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new androidx.datastore.preferences.protobuf.k(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new androidx.datastore.preferences.protobuf.k("Did not expect uri to have query");
        }
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        String str2 = (String) arrayList.get(0);
        switch (str2.hashCode()) {
            case -1820761141:
                if (str2.equals("external")) {
                    externalFilesDir = context.getExternalFilesDir(null);
                    File file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!ia.s(context)) {
                        synchronized (this.f2172c) {
                            try {
                                if (this.f2173d == null) {
                                    this.f2173d = g1.b(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                }
                                str = this.f2173d;
                            } finally {
                            }
                        }
                        if (!file.getAbsolutePath().startsWith(str)) {
                            throw new ge("Cannot access credential-protected data from direct boot");
                        }
                    }
                    return file;
                }
                throw new androidx.datastore.preferences.protobuf.k(String.format("Path must start with a valid logical location: %s", uri));
            case 94416770:
                if (str2.equals("cache")) {
                    externalFilesDir = context.getCacheDir();
                    File file2 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!ia.s(context)) {
                    }
                    return file2;
                }
                throw new androidx.datastore.preferences.protobuf.k(String.format("Path must start with a valid logical location: %s", uri));
            case 97434231:
                if (str2.equals("files")) {
                    externalFilesDir = g1.b(context);
                    File file22 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!ia.s(context)) {
                    }
                    return file22;
                }
                throw new androidx.datastore.preferences.protobuf.k(String.format("Path must start with a valid logical location: %s", uri));
            case 835260319:
                if (str2.equals("managed")) {
                    File file3 = new File(g1.b(context), "managed");
                    if (arrayList.size() >= 3) {
                        try {
                            String str3 = (String) arrayList.get(2);
                            Account account2 = ae.f2145a;
                            if ("shared".equals(str3)) {
                                account = ae.f2145a;
                            } else {
                                int indexOf = str3.indexOf(58);
                                oa.e(indexOf >= 0, "Malformed account", new Object[0]);
                                account = new Account(str3.substring(indexOf + 1), str3.substring(0, indexOf));
                            }
                            if (!ae.f2145a.equals(account)) {
                                throw new androidx.datastore.preferences.protobuf.k("AccountManager cannot be null");
                            }
                        } catch (IllegalArgumentException e2) {
                            throw new androidx.datastore.preferences.protobuf.k(e2);
                        }
                    }
                    externalFilesDir = file3;
                    File file222 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!ia.s(context)) {
                    }
                    return file222;
                }
                throw new androidx.datastore.preferences.protobuf.k(String.format("Path must start with a valid logical location: %s", uri));
            case 988548496:
                if (str2.equals("directboot-cache")) {
                    externalFilesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                    File file2222 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!ia.s(context)) {
                    }
                    return file2222;
                }
                throw new androidx.datastore.preferences.protobuf.k(String.format("Path must start with a valid logical location: %s", uri));
            case 991565957:
                if (str2.equals("directboot-files")) {
                    externalFilesDir = context.createDeviceProtectedStorageContext().getFilesDir();
                    File file22222 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!ia.s(context)) {
                    }
                    return file22222;
                }
                throw new androidx.datastore.preferences.protobuf.k(String.format("Path must start with a valid logical location: %s", uri));
            default:
                throw new androidx.datastore.preferences.protobuf.k(String.format("Path must start with a valid logical location: %s", uri));
        }
    }

    public final Uri h(Uri uri) {
        if (i(uri)) {
            throw new androidx.datastore.preferences.protobuf.k("Operation across authorities is not allowed.");
        }
        File g = g(uri);
        Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
        b8.d dVar = b8.g.f1423e;
        c6.f.n(4, "initialCapacity");
        path.path(g.getAbsolutePath());
        return path.encodedFragment(le.a(b8.g.k(0, new Object[4]))).build();
    }

    public final boolean i(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.f2170a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }
}
