package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afn {
    public static final void a(Activity activity) {
        activity.getClass();
        activity.registerActivityLifecycleCallbacks(new afo());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(Activity activity, aej aejVar) {
        aejVar.getClass();
        if (activity instanceof aet) {
            ((aet) activity).a().b(aejVar);
        } else if (activity instanceof aer) {
            ael L = ((aer) activity).L();
            if (L instanceof ael) {
                L.b(aejVar);
            }
        }
    }

    public static final void c(Activity activity) {
        activity.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            afn afnVar = afo.Companion;
            a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new afp(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x02ee A[Catch: all -> 0x0321, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0321, blocks: (B:45:0x01a5, B:50:0x01be, B:51:0x01c3, B:53:0x01c9, B:60:0x01d5, B:63:0x01e6, B:71:0x02e3, B:74:0x02ee, B:111:0x02d8, B:120:0x0302, B:121:0x0305, B:124:0x030a, B:117:0x0300, B:65:0x01f0, B:82:0x021b, B:83:0x0227, B:85:0x022d, B:92:0x0236, B:95:0x024c, B:99:0x0266, B:100:0x0283, B:102:0x0289, B:104:0x0299, B:105:0x02b8, B:107:0x02be, B:109:0x02ce), top: B:44:0x01a5, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final aly d(ana anaVar, String str) {
        long j;
        Map e;
        Set set;
        int i;
        String str2;
        Throwable th;
        Object obj;
        ana anaVar2 = anaVar;
        amh a = anaVar2.a(a.Z(str, "PRAGMA table_info(`", "`)"));
        try {
            String str3 = "name";
            if (a.l()) {
                int e2 = e(a, "name");
                int e3 = e(a, "type");
                int e4 = e(a, "notnull");
                int e5 = e(a, "pk");
                int e6 = e(a, "dflt_value");
                j = 0;
                kpy kpyVar = new kpy(8);
                while (true) {
                    String d = a.d(e2);
                    int i2 = e3;
                    kpyVar.put(d, new alv(d, a.d(e3), a.b(e4) != 0, (int) a.b(e5), a.k(e6) ? null : a.d(e6), 2));
                    if (!a.l()) {
                        break;
                    }
                    anaVar2 = anaVar;
                    e3 = i2;
                }
                e = kpyVar.e();
                ixf.i(a, null);
            } else {
                e = kpl.a;
                ixf.i(a, null);
                j = 0;
            }
            a = anaVar2.a(a.Z(str, "PRAGMA foreign_key_list(`", "`)"));
            try {
                int e7 = e(a, "id");
                int e8 = e(a, "seq");
                int e9 = e(a, "table");
                int e10 = e(a, "on_delete");
                int e11 = e(a, "on_update");
                int e12 = e(a, "id");
                int e13 = e(a, "seq");
                int e14 = e(a, "from");
                int e15 = e(a, "to");
                Map map = e;
                kpt kptVar = new kpt(10);
                while (a.l()) {
                    kptVar.add(new alt((int) a.b(e12), (int) a.b(e13), a.d(e14), a.d(e15)));
                    e11 = e11;
                    e10 = e10;
                }
                int i3 = e10;
                int i4 = e11;
                List n = ixc.n(ixc.a(kptVar));
                a.j();
                kqd kqdVar = new kqd();
                while (a.l()) {
                    if (a.b(e8) == j) {
                        int b = (int) a.b(e7);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList<alt> arrayList3 = new ArrayList();
                        for (Object obj2 : n) {
                            if (((alt) obj2).a == b) {
                                arrayList3.add(obj2);
                            }
                        }
                        for (alt altVar : arrayList3) {
                            arrayList.add(altVar.b);
                            arrayList2.add(altVar.c);
                        }
                        int i5 = i3;
                        int i6 = i4;
                        kqdVar.add(new alw(a.d(e9), a.d(i5), a.d(i6), arrayList, arrayList2));
                        i3 = i5;
                        i4 = i6;
                    }
                }
                Set j2 = ixd.j(kqdVar);
                ixf.i(a, null);
                ana anaVar3 = anaVar;
                a = anaVar3.a(a.Z(str, "PRAGMA index_list(`", "`)"));
                try {
                    int e16 = e(a, "name");
                    int e17 = e(a, "origin");
                    int e18 = e(a, "unique");
                    if (e16 != -1 && e17 != -1 && e18 != -1) {
                        kqd kqdVar2 = new kqd();
                        while (true) {
                            if (!a.l()) {
                                Set j3 = ixd.j(kqdVar2);
                                ixf.i(a, null);
                                set = j3;
                                break;
                            }
                            if (ksp.b("c", a.d(e17))) {
                                String d2 = a.d(e16);
                                boolean z = a.b(e18) == 1;
                                a = anaVar3.a(a.Z(d2, "PRAGMA index_xinfo(`", "`)"));
                                try {
                                    int e19 = e(a, "seqno");
                                    int e20 = e(a, "cid");
                                    int e21 = e(a, str3);
                                    int i7 = e16;
                                    int e22 = e(a, "desc");
                                    int i8 = e17;
                                    if (e19 == -1 || e20 == -1 || e21 == -1) {
                                        i = e18;
                                        str2 = str3;
                                        th = null;
                                    } else if (e22 == -1) {
                                        i = e18;
                                        str2 = str3;
                                        th = null;
                                    } else {
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        i = e18;
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                        while (a.l()) {
                                            String str4 = str3;
                                            if (((int) a.b(e20)) >= 0) {
                                                int b2 = (int) a.b(e19);
                                                String d3 = a.d(e21);
                                                String str5 = a.b(e22) > j ? "DESC" : "ASC";
                                                Integer valueOf = Integer.valueOf(b2);
                                                linkedHashMap.put(valueOf, d3);
                                                linkedHashMap2.put(valueOf, str5);
                                                str3 = str4;
                                                e22 = e22;
                                            } else {
                                                str3 = str4;
                                            }
                                        }
                                        str2 = str3;
                                        List o = ixc.o(linkedHashMap.entrySet(), new alu(0));
                                        ArrayList arrayList4 = new ArrayList(ixc.w(o));
                                        Iterator it = o.iterator();
                                        while (it.hasNext()) {
                                            arrayList4.add((String) ((Map.Entry) it.next()).getValue());
                                        }
                                        List p = ixc.p(arrayList4);
                                        List o2 = ixc.o(linkedHashMap2.entrySet(), new alu(2));
                                        ArrayList arrayList5 = new ArrayList(ixc.w(o2));
                                        Iterator it2 = o2.iterator();
                                        while (it2.hasNext()) {
                                            arrayList5.add((String) ((Map.Entry) it2.next()).getValue());
                                        }
                                        obj = new alx(d2, z, p, ixc.p(arrayList5));
                                        ixf.i(a, null);
                                        th = null;
                                        if (obj != null) {
                                            ixf.i(a, th);
                                            set = null;
                                            break;
                                        }
                                        kqdVar2.add(obj);
                                        anaVar3 = anaVar;
                                        e16 = i7;
                                        e17 = i8;
                                        e18 = i;
                                        str3 = str2;
                                    }
                                    ixf.i(a, th);
                                    obj = th;
                                    if (obj != null) {
                                    }
                                } finally {
                                }
                            } else {
                                anaVar3 = anaVar;
                            }
                        }
                        return new aly(str, map, j2, set);
                    }
                    ixf.i(a, null);
                    set = null;
                    return new aly(str, map, j2, set);
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static final int e(amh amhVar, String str) {
        int c = afg.c(amhVar, str);
        if (c >= 0) {
            return c;
        }
        int c2 = afg.c(amhVar, "`" + str + '`');
        if (c2 >= 0) {
            return c2;
        }
        return -1;
    }

    public static /* synthetic */ String f(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "FINISHED" : "ENCODE" : "SOURCE" : "DATA_CACHE" : "RESOURCE_CACHE" : "INITIALIZE";
    }

    public static AssetFileDescriptor g(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor;
        openAssetFileDescriptor = MediaStore.openAssetFileDescriptor(contentResolver, uri, "r", null);
        return openAssetFileDescriptor;
    }

    public static boolean h() {
        int extensionVersion;
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(30);
        return extensionVersion >= 17;
    }

    public static boolean i(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean j(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    public static boolean k(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public static int l(List list, bbf bbfVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = bbfVar.a((baz) list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType m(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser$ImageType.UNKNOWN : n(list, new bba(byteBuffer, 0));
    }

    public static ImageHeaderParser$ImageType n(List list, bbg bbgVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser$ImageType a = bbgVar.a((baz) list.get(i));
            if (a != ImageHeaderParser$ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static boolean o(List list, bbe bbeVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (bbeVar.a((baz) list.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static int p(List list, InputStream inputStream, bek bekVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new bin(inputStream, bekVar);
        }
        inputStream.mark(5242880);
        return l(list, new bbc(inputStream, bekVar, 0));
    }

    public static ImageHeaderParser$ImageType q(List list, InputStream inputStream, bek bekVar) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new bin(inputStream, bekVar);
        }
        inputStream.mark(5242880);
        return n(list, new bba(inputStream, 1));
    }

    public static /* synthetic */ String r(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }
}
