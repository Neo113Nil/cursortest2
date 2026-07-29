package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.aiming.mdt.utils.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: NativeProtocol.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6200a = "com.facebook.internal.w";

    /* renamed from: b, reason: collision with root package name */
    private static List<c> f6201b = e();

    /* renamed from: c, reason: collision with root package name */
    private static Map<String, List<c>> f6202c = f();

    /* renamed from: d, reason: collision with root package name */
    private static AtomicBoolean f6203d = new AtomicBoolean(false);
    private static final List<Integer> e = Arrays.asList(20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101);

    /* compiled from: NativeProtocol.java */
    private static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        private static final HashSet<String> f6204a = c();

        /* renamed from: b, reason: collision with root package name */
        private TreeSet<Integer> f6205b;

        protected abstract String a();

        private c() {
        }

        private static HashSet<String> c() {
            HashSet<String> hashSet = new HashSet<>();
            hashSet.add("8a3c4b262d721acd49a4bf97d5213199c86fa2b9");
            hashSet.add("a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc");
            hashSet.add("5e8f16062ea3cd2c4a0d547876baa6f38cabf625");
            return hashSet;
        }

        public boolean a(Context context, String str) {
            String str2 = Build.BRAND;
            int i = context.getApplicationInfo().flags;
            if (str2.startsWith("generic") && (i & 2) != 0) {
                return true;
            }
            try {
                for (Signature signature : context.getPackageManager().getPackageInfo(str, 64).signatures) {
                    if (f6204a.contains(ab.a(signature.toByteArray()))) {
                        return true;
                    }
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }

        public TreeSet<Integer> b() {
            if (this.f6205b == null) {
                a(false);
            }
            return this.f6205b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void a(boolean z) {
            if (!z) {
                try {
                    if (this.f6205b == null) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f6205b = w.b(this);
        }
    }

    /* compiled from: NativeProtocol.java */
    private static class a extends c {
        @Override // com.facebook.internal.w.c
        protected String a() {
            return Constants.PKG_FB;
        }

        private a() {
            super();
        }
    }

    /* compiled from: NativeProtocol.java */
    private static class b extends c {
        @Override // com.facebook.internal.w.c
        protected String a() {
            return "com.facebook.orca";
        }

        private b() {
            super();
        }
    }

    /* compiled from: NativeProtocol.java */
    private static class d extends c {
        @Override // com.facebook.internal.w.c
        protected String a() {
            return "com.facebook.wakizashi";
        }

        private d() {
            super();
        }
    }

    private static List<c> e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a());
        arrayList.add(new d());
        return arrayList;
    }

    private static Map<String, List<c>> f() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b());
        hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", f6201b);
        hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", f6201b);
        hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", f6201b);
        hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", f6201b);
        hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
        return hashMap;
    }

    static Intent a(Context context, Intent intent, c cVar) {
        ResolveInfo resolveActivity;
        if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null || !cVar.a(context, resolveActivity.activityInfo.packageName)) {
            return null;
        }
        return intent;
    }

    static Intent b(Context context, Intent intent, c cVar) {
        ResolveInfo resolveService;
        if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null || !cVar.a(context, resolveService.serviceInfo.packageName)) {
            return null;
        }
        return intent;
    }

    public static Intent a(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, com.facebook.login.a aVar, String str3) {
        for (c cVar : f6201b) {
            Intent putExtra = new Intent().setClassName(cVar.a(), "com.facebook.katana.ProxyAuth").putExtra("client_id", str);
            if (!ab.a(collection)) {
                putExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!ab.a(str2)) {
                putExtra.putExtra("e2e", str2);
            }
            putExtra.putExtra("state", str3);
            putExtra.putExtra("response_type", "token,signed_request");
            putExtra.putExtra("return_scopes", "true");
            if (z2) {
                putExtra.putExtra("default_audience", aVar.a());
            }
            putExtra.putExtra("legacy_override", "v2.6");
            if (z) {
                putExtra.putExtra("auth_type", "rerequest");
            }
            Intent a2 = a(context, putExtra, cVar);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public static final int a() {
        return e.get(0).intValue();
    }

    private static Intent a(Context context, String str, String str2) {
        List<c> list = f6202c.get(str2);
        Intent intent = null;
        if (list == null) {
            return null;
        }
        for (c cVar : list) {
            intent = a(context, new Intent().setAction(str).setPackage(cVar.a()).addCategory("android.intent.category.DEFAULT"), cVar);
            if (intent != null) {
                return intent;
            }
        }
        return intent;
    }

    public static boolean a(int i) {
        return e.contains(Integer.valueOf(i)) && i >= 20140701;
    }

    public static Intent a(Context context, String str, String str2, int i, Bundle bundle) {
        Intent a2 = a(context, "com.facebook.platform.PLATFORM_ACTIVITY", str2);
        if (a2 == null) {
            return null;
        }
        a(a2, str, str2, i, bundle);
        return a2;
    }

    public static void a(Intent intent, String str, String str2, int i, Bundle bundle) {
        String i2 = com.facebook.l.i();
        String j = com.facebook.l.j();
        intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", i2);
        if (a(i)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", str);
            ab.a(bundle2, "app_name", j);
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle);
            return;
        }
        intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
        if (!ab.a(j)) {
            intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", j);
        }
        intent.putExtras(bundle);
    }

    public static Intent a(Intent intent, Bundle bundle, com.facebook.j jVar) {
        UUID b2 = b(intent);
        if (b2 == null) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", a(intent));
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", b2.toString());
        if (jVar != null) {
            bundle2.putBundle("error", a(jVar));
        }
        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle != null) {
            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        }
        return intent2;
    }

    public static Intent a(Context context) {
        for (c cVar : f6201b) {
            Intent b2 = b(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(cVar.a()).addCategory("android.intent.category.DEFAULT"), cVar);
            if (b2 != null) {
                return b2;
            }
        }
        return null;
    }

    public static int a(Intent intent) {
        return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
    }

    public static UUID b(Intent intent) {
        String stringExtra;
        if (intent == null) {
            return null;
        }
        if (a(a(intent))) {
            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
        } else {
            stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        }
        if (stringExtra != null) {
            try {
                return UUID.fromString(stringExtra);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public static Bundle c(Intent intent) {
        if (a(a(intent))) {
            return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
        }
        return null;
    }

    public static Bundle d(Intent intent) {
        if (!a(a(intent))) {
            return intent.getExtras();
        }
        return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
    }

    public static Bundle e(Intent intent) {
        int a2 = a(intent);
        Bundle extras = intent.getExtras();
        return (!a(a2) || extras == null) ? extras : extras.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
    }

    public static boolean f(Intent intent) {
        Bundle c2 = c(intent);
        if (c2 != null) {
            return c2.containsKey("error");
        }
        return intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
    }

    public static Bundle g(Intent intent) {
        if (!f(intent)) {
            return null;
        }
        Bundle c2 = c(intent);
        if (c2 != null) {
            return c2.getBundle("error");
        }
        return intent.getExtras();
    }

    public static com.facebook.j a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_type");
        if (string == null) {
            string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String string2 = bundle.getString("error_description");
        if (string2 == null) {
            string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        if (string != null && string.equalsIgnoreCase("UserCanceled")) {
            return new com.facebook.k(string2);
        }
        return new com.facebook.j(string2);
    }

    public static Bundle a(com.facebook.j jVar) {
        if (jVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("error_description", jVar.toString());
        if (jVar instanceof com.facebook.k) {
            bundle.putString("error_type", "UserCanceled");
        }
        return bundle;
    }

    public static int b(int i) {
        return a(f6201b, new int[]{i});
    }

    public static int a(String str, int[] iArr) {
        return a(f6202c.get(str), iArr);
    }

    private static int a(List<c> list, int[] iArr) {
        b();
        if (list == null) {
            return -1;
        }
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            int a2 = a(it.next().b(), a(), iArr);
            if (a2 != -1) {
                return a2;
            }
        }
        return -1;
    }

    public static void b() {
        if (f6203d.compareAndSet(false, true)) {
            com.facebook.l.d().execute(new Runnable() { // from class: com.facebook.internal.w.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Iterator it = w.f6201b.iterator();
                        while (it.hasNext()) {
                            ((c) it.next()).a(true);
                        }
                    } finally {
                        w.f6203d.set(false);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TreeSet<Integer> b(c cVar) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        ContentResolver contentResolver = com.facebook.l.f().getContentResolver();
        String[] strArr = {"version"};
        Uri c2 = c(cVar);
        Cursor cursor = null;
        try {
            if (com.facebook.l.f().getPackageManager().resolveContentProvider(cVar.a() + ".provider.PlatformProvider", 0) != null) {
                try {
                    cursor = contentResolver.query(c2, strArr, null, null, null);
                } catch (NullPointerException | SecurityException unused) {
                    Log.e(f6200a, "Failed to query content resolver.");
                }
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        treeSet.add(Integer.valueOf(cursor.getInt(cursor.getColumnIndex("version"))));
                    }
                }
            }
            return treeSet;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public static int a(TreeSet<Integer> treeSet, int i, int[] iArr) {
        int length = iArr.length - 1;
        Iterator<Integer> descendingIterator = treeSet.descendingIterator();
        int i2 = length;
        int i3 = -1;
        while (descendingIterator.hasNext()) {
            int intValue = descendingIterator.next().intValue();
            i3 = Math.max(i3, intValue);
            while (i2 >= 0 && iArr[i2] > intValue) {
                i2--;
            }
            if (i2 < 0) {
                return -1;
            }
            if (iArr[i2] == intValue) {
                if (i2 % 2 == 0) {
                    return Math.min(i3, i);
                }
                return -1;
            }
        }
        return -1;
    }

    private static Uri c(c cVar) {
        return Uri.parse("content://" + cVar.a() + ".provider.PlatformProvider/versions");
    }
}
