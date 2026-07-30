package com.baidu.bbalbscesium.j;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.content.UriPermission;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import cn.hutool.core.util.l;
import com.baidu.bbalbscesium.h;
import com.baidu.bbalbscesium.i.i;
import com.baidu.bbalbscesium.j.a;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class d extends com.baidu.bbalbscesium.j.a {

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f4031i = false;

    /* renamed from: j, reason: collision with root package name */
    private static final String f4032j = "Cesium";

    /* renamed from: k, reason: collision with root package name */
    private static final int f4033k = 1;

    /* renamed from: l, reason: collision with root package name */
    private static final int f4034l = 2;

    /* renamed from: m, reason: collision with root package name */
    private static final int f4035m = 2;

    /* renamed from: n, reason: collision with root package name */
    private static final long f4036n = 5;

    /* renamed from: o, reason: collision with root package name */
    private static final int f4037o = 6;

    /* renamed from: p, reason: collision with root package name */
    private static final int f4038p = 16;

    /* renamed from: g, reason: collision with root package name */
    private Context f4039g;

    /* renamed from: h, reason: collision with root package name */
    private f f4040h;

    static final class a implements Comparable<a> {

        /* renamed from: a, reason: collision with root package name */
        private static final String[] f4041a = {"read0", "read1", "read2", "read3", "access0", "access1", "access2", "access3", "sync0", "sync1", "sync2", "sync3", "open0", "open1", "open2", "open3"};

        /* renamed from: b, reason: collision with root package name */
        private final int f4042b;

        private a(int i8) {
            this.f4042b = i8;
        }

        public byte a() {
            return (byte) this.f4042b;
        }

        public String b() {
            return f4041a[this.f4042b];
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && a.class == obj.getClass() && this.f4042b == ((a) obj).f4042b;
        }

        public int hashCode() {
            return this.f4042b;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return this.f4042b - aVar.f4042b;
        }

        public static a a(byte b8, boolean z7) {
            return a(z7 ? (b8 & 255) >> 4 : b8 & 15);
        }

        public static a a(int i8) {
            if (i8 >= 0 && i8 < 16) {
                return new a(i8);
            }
            throw new IllegalArgumentException("invalid idx " + i8);
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        private int f4043a = 33;

        /* renamed from: b, reason: collision with root package name */
        private a[] f4044b = new a[33];

        /* renamed from: c, reason: collision with root package name */
        private int f4045c;

        public b() {
        }

        public int a() {
            return this.f4045c;
        }

        public a b(int i8) {
            if (i8 < this.f4045c) {
                return this.f4044b[i8];
            }
            throw new IndexOutOfBoundsException("idx " + i8 + " size " + this.f4045c);
        }

        private void a(int i8) {
            a[] aVarArr = this.f4044b;
            if (i8 - aVarArr.length > 0) {
                int length = aVarArr.length;
                int i9 = length + (length >> 1);
                if (i9 - i8 >= 0) {
                    i8 = i9;
                }
                this.f4044b = (a[]) Arrays.copyOf(aVarArr, i8);
            }
        }

        public byte[] b() {
            int i8;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i9 = 0;
            while (true) {
                i8 = this.f4045c;
                if (i9 >= i8 / 2) {
                    break;
                }
                int i10 = i9 * 2;
                byteArrayOutputStream.write((byte) (((b(i10 + 1).a() & 255) << 4) | (b(i10).a() & 255)));
                i9++;
            }
            if (i8 % 2 != 0) {
                byteArrayOutputStream.write((byte) (b(i8 - 1).a() & 255));
            }
            return byteArrayOutputStream.toByteArray();
        }

        public void a(a aVar) {
            a(this.f4045c + 1);
            a[] aVarArr = this.f4044b;
            int i8 = this.f4045c;
            this.f4045c = i8 + 1;
            aVarArr[i8] = aVar;
        }
    }

    static class c {

        /* renamed from: a, reason: collision with root package name */
        private List<b> f4047a = new ArrayList();

        class a implements Comparator<b> {
            a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(b bVar, b bVar2) {
                return bVar.f4049a - bVar2.f4049a;
            }
        }

        static class b {

            /* renamed from: a, reason: collision with root package name */
            private int f4049a;

            /* renamed from: b, reason: collision with root package name */
            private a f4050b;

            public b(a aVar) {
                this.f4050b = aVar;
            }

            public void a() {
                this.f4049a++;
            }
        }

        c() {
        }

        public List<b> a() {
            ArrayList arrayList = new ArrayList(this.f4047a);
            Collections.sort(arrayList, new a());
            return arrayList;
        }

        public void a(a aVar) {
            this.f4047a.add(new b(aVar));
        }
    }

    /* renamed from: com.baidu.bbalbscesium.j.d$d, reason: collision with other inner class name */
    static class C0046d {

        /* renamed from: a, reason: collision with root package name */
        byte[] f4051a;

        /* renamed from: b, reason: collision with root package name */
        byte f4052b;

        /* renamed from: c, reason: collision with root package name */
        byte[] f4053c;

        public C0046d(byte[] bArr, byte b8, byte[] bArr2) {
            this.f4051a = bArr;
            this.f4052b = b8;
            this.f4053c = bArr2;
        }

        public h.a a() {
            try {
                String a8 = com.baidu.bbalbscesium.m.c.a(this.f4051a, "", true);
                String str = new String(new byte[]{this.f4052b}, l.UTF_8);
                byte[] bArr = this.f4053c;
                return h.a(a8, str, bArr != null ? new String(bArr, l.UTF_8) : null);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        public int f4054a;

        /* renamed from: b, reason: collision with root package name */
        public int f4055b;

        /* renamed from: c, reason: collision with root package name */
        public int f4056c = 16;

        e() {
        }

        public String toString() {
            return "";
        }
    }

    static class f {

        /* renamed from: a, reason: collision with root package name */
        private Method f4057a;

        /* renamed from: b, reason: collision with root package name */
        private Method f4058b;

        /* renamed from: c, reason: collision with root package name */
        private Method f4059c;

        /* renamed from: d, reason: collision with root package name */
        private Method f4060d;

        /* renamed from: e, reason: collision with root package name */
        private Method f4061e;

        f() {
        }

        public int a(Context context, Uri uri, int i8, int i9, int i10) {
            try {
                return ((Integer) this.f4057a.invoke(context, uri, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10))).intValue();
            } catch (Exception e8) {
                throw new i.a(e8);
            }
        }

        public void b(ContentResolver contentResolver, Uri uri, int i8) {
            try {
                this.f4059c.invoke(contentResolver, uri, Integer.valueOf(i8));
            } catch (Exception e8) {
                throw new i.a(e8);
            }
        }

        void a() {
            try {
                String a8 = i.a(com.baidu.bbalbscesium.i.h.a());
                Class cls = Integer.TYPE;
                this.f4057a = i.a(Context.class, a8, new Class[]{Uri.class, cls, cls, cls});
                this.f4058b = i.a(Context.class, i.a(com.baidu.bbalbscesium.i.h.d()), new Class[]{String.class, Uri.class, cls});
                this.f4059c = i.a(ContentResolver.class, i.a(com.baidu.bbalbscesium.i.h.g()), new Class[]{Uri.class, cls});
                this.f4060d = i.a(Context.class, i.a(com.baidu.bbalbscesium.i.h.f()), new Class[]{Uri.class, cls});
                this.f4061e = i.a(ContentResolver.class, i.a(com.baidu.bbalbscesium.i.h.e()), new Class[]{Uri.class, cls});
            } catch (Exception unused) {
            }
        }

        public void a(ContentResolver contentResolver, Uri uri, int i8) {
            try {
                this.f4061e.invoke(contentResolver, uri, Integer.valueOf(i8));
            } catch (Exception e8) {
                throw new i.a(e8);
            }
        }

        public void a(Context context, Uri uri, int i8) {
            try {
                this.f4060d.invoke(context, uri, Integer.valueOf(i8));
            } catch (Exception e8) {
                throw new i.a(e8);
            }
        }

        public void a(Context context, String str, Uri uri, int i8) {
            try {
                this.f4058b.invoke(context, str, uri, Integer.valueOf(i8));
            } catch (Exception e8) {
                throw new i.a(e8);
            }
        }
    }

    public d() {
        super(com.baidu.bbalbscesium.j.b.f3995c, com.baidu.bbalbscesium.j.b.f3996d);
        f fVar = new f();
        this.f4040h = fVar;
        fVar.a();
    }

    private String b(String str) {
        return str + ".cesium";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] c(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 * 2;
            int digit = Character.digit(str.charAt(i9), 16);
            int digit2 = Character.digit(str.charAt(i9 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i8] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }

    @Override // com.baidu.bbalbscesium.j.a
    public a.f a(a.e eVar, h.a aVar) {
        return a.f.d();
    }

    @Override // com.baidu.bbalbscesium.j.a
    public a.h a(String str, a.g gVar) {
        int i8;
        byte[] bArr;
        boolean z7;
        Byte b8;
        Byte b9;
        int packageUid;
        if (Build.VERSION.SDK_INT < 26) {
            return a.h.a();
        }
        try {
            packageUid = this.f4039g.getPackageManager().getPackageUid(str, 0);
            i8 = packageUid;
        } catch (PackageManager.NameNotFoundException unused) {
            i8 = -1;
        }
        if (i8 < 0) {
            return a.h.a();
        }
        e eVar = new e();
        b bVar = new b();
        c cVar = new c();
        c cVar2 = new c();
        for (int i9 = 0; i9 < 16; i9++) {
            a a8 = a.a(i9);
            if (a(str, a8, i8)) {
                cVar.a(a8);
            } else {
                cVar2.a(a8);
            }
        }
        for (int i10 = 0; i10 < 32; i10++) {
            a a9 = a(str, i10, cVar.a(), i8, eVar);
            if (a9 == null) {
                a9 = a(str, i10, cVar2.a(), i8, eVar);
            }
            if (a9 == null) {
                return a.h.a();
            }
            bVar.a(a9);
        }
        byte[] b10 = bVar.b();
        int i11 = 3;
        byte[] bArr2 = {"0".getBytes()[0], "O".getBytes()[0], "V".getBytes()[0]};
        int i12 = 0;
        while (true) {
            bArr = null;
            if (i12 >= i11) {
                z7 = true;
                b8 = null;
                break;
            }
            byte b11 = bArr2[i12];
            a a10 = a.a(b11, false);
            int i13 = i12;
            z7 = true;
            byte[] bArr3 = bArr2;
            if (a(str, 32, a10, i8, eVar)) {
                a a11 = a.a(b11, true);
                if (a(str, 33, a11, i8, eVar)) {
                    b bVar2 = new b();
                    bVar2.a(a10);
                    bVar2.a(a11);
                    b8 = Byte.valueOf(bVar2.b()[0]);
                    break;
                }
            }
            i12 = i13 + 1;
            bArr2 = bArr3;
            i11 = 3;
        }
        if (b8 == null) {
            b bVar3 = new b();
            int i14 = 32;
            for (int i15 = 34; i14 < i15; i15 = 34) {
                int i16 = i14;
                b bVar4 = bVar3;
                a a12 = a(str, i14, cVar.a(), i8, eVar);
                if (a12 == null) {
                    a12 = a(str, i16, cVar2.a(), i8, eVar);
                }
                if (a12 == null) {
                    return a.h.a();
                }
                bVar4.a(a12);
                i14 = i16 + 1;
                bVar3 = bVar4;
            }
            b9 = Byte.valueOf(bVar3.b()[0]);
        } else {
            b9 = b8;
            z7 = false;
        }
        if (z7) {
            b bVar5 = new b();
            for (int i17 = 34; i17 < 94; i17++) {
                a a13 = a(str, i17, cVar.a(), i8, eVar);
                if (a13 == null) {
                    a13 = a(str, i17, cVar2.a(), i8, eVar);
                }
                if (a13 == null) {
                    break;
                }
                bVar5.a(a13);
            }
            if (bVar5.a() > 0) {
                bArr = bVar5.b();
            }
        }
        return a.h.a(new C0046d(b10, b9.byteValue(), bArr).a());
    }

    private a a(String str, int i8, List<c.b> list, int i9, e eVar) {
        for (c.b bVar : list) {
            if (a(str, i8, bVar.f4050b, i9, eVar)) {
                bVar.a();
                return bVar.f4050b;
            }
        }
        return null;
    }

    private String a(String str, int i8, a aVar) {
        return String.format("content://%s/dat/v1/i%d/%s", b(str), Integer.valueOf(i8), aVar.b());
    }

    private String a(String str, a aVar) {
        return String.format("content://%s/dic/v1/%s", b(str), aVar.b());
    }

    private void a(UriMatcher uriMatcher) {
        uriMatcher.addURI(b(this.f4039g.getPackageName()), "dat/v1/*/*", 1);
        uriMatcher.addURI(b(this.f4039g.getPackageName()), "dic/v1/*", 2);
    }

    @Override // com.baidu.bbalbscesium.j.a
    public void a(a.d dVar) {
        this.f4039g = this.f3967a.f3971a;
    }

    private boolean a(int i8, a aVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        return a(Uri.parse(a(this.f4039g.getPackageName(), i8, aVar)));
    }

    private boolean a(Uri uri) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Context context = this.f4039g;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            this.f4040h.a(context, context.getPackageName(), uri, 65);
            this.f4040h.b(contentResolver, uri, 1);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean a(Uri uri, int i8) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Context context = this.f4039g;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            this.f4040h.a(context, uri, i8);
            this.f4040h.a(contentResolver, uri, i8);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean a(a aVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        return a(Uri.parse(a(this.f4039g.getPackageName(), aVar)));
    }

    private boolean a(b bVar, List<a> list) {
        int i8;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        ContentResolver contentResolver = this.f4039g.getContentResolver();
        UriMatcher uriMatcher = new UriMatcher(-1);
        a(uriMatcher);
        List<UriPermission> persistedUriPermissions = contentResolver.getPersistedUriPermissions();
        if (persistedUriPermissions == null || persistedUriPermissions.size() == 0) {
            persistedUriPermissions = contentResolver.getOutgoingPersistedUriPermissions();
        }
        if (persistedUriPermissions == null || persistedUriPermissions.size() == 0) {
            return true;
        }
        for (UriPermission uriPermission : persistedUriPermissions) {
            Uri uri = uriPermission.getUri();
            int match = uriMatcher.match(uri);
            List<String> pathSegments = uri.getPathSegments();
            if ((match == 1 || match == 2) && uriPermission.isWritePermission()) {
                a(uri, uriPermission.isReadPermission() ? 3 : 2);
            } else if (match == 1) {
                try {
                    i8 = Integer.valueOf(pathSegments.get(2).substring(1)).intValue();
                } catch (Exception unused) {
                    i8 = -1;
                }
                if (i8 >= 0 && i8 < bVar.a()) {
                    if (!bVar.b(i8).b().equals(pathSegments.get(3))) {
                    }
                }
                a(uri, 1);
            } else if (match == 2) {
                String str = pathSegments.get(2);
                Iterator<a> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().b().equals(str)) {
                        break;
                    }
                }
                a(uri, 1);
            }
        }
        int a8 = bVar.a();
        for (int i9 = 0; i9 < a8; i9++) {
            if (!a(this.f4039g.getPackageName(), i9, bVar.b(i9), Process.myUid(), (e) null)) {
                return true;
            }
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!a(this.f4039g.getPackageName(), list.get(i10), Process.myUid())) {
                return true;
            }
        }
        return false;
    }

    private boolean a(String str, int i8, a aVar, int i9, e eVar) {
        Uri parse = Uri.parse(a(str, i8, aVar));
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                break;
            }
            if (eVar != null) {
                try {
                    eVar.f4054a++;
                } catch (Throwable unused) {
                    try {
                        Thread.sleep(5L);
                    } catch (Exception unused2) {
                    }
                    i10++;
                }
            }
            if (this.f4040h.a(this.f4039g, parse, 0, i9, 1) == 0) {
                return true;
            }
        }
        if (eVar != null) {
            eVar.f4055b++;
        }
        return false;
    }

    private boolean a(String str, a aVar, int i8) {
        Uri parse = Uri.parse(a(str, aVar));
        int i9 = 0;
        while (true) {
            if (i9 >= 2) {
                break;
            }
            try {
                if (this.f4040h.a(this.f4039g, parse, 0, i8, 1) == 0) {
                    return true;
                }
            } catch (Throwable unused) {
                try {
                    Thread.sleep(5L);
                } catch (Exception unused2) {
                }
                i9++;
            }
        }
        return false;
    }
}
