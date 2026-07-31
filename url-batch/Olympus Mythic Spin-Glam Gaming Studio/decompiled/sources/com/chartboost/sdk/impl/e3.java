package com.chartboost.sdk.impl;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.chartboost.sdk.internal.Model.CBError;
import com.ironsource.C4701ic;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class e3 {
    public static final a j = new a(null);
    public final c a;
    public String b;
    public final af c;
    public final File d;
    public final AtomicReference e;
    public long f;
    public long g;
    public long h;
    public b i;

    public e3(c method, String uri, af priority, File file) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(priority, "priority");
        this.a = method;
        this.b = uri;
        this.c = priority;
        this.d = file;
        this.e = new AtomicReference(d.c);
        this.i = b.b;
    }

    public void a(CBError cBError, h3 h3Var) {
    }

    public void a(Object obj, h3 h3Var) {
    }

    public void a(String uri, long j2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
    }

    public f3 a() {
        return new f3(null, null, null);
    }

    public g3 a(h3 h3Var) {
        return g3.c.a((Object) null);
    }

    public final c c() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public final af d() {
        return this.c;
    }

    public final boolean b() {
        return MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.e, d.c, d.b);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c b = new c(C4701ic.a, 0);
        public static final c c = new c("POST", 1);
        public static final /* synthetic */ c[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            c[] a = a();
            d = a;
            e = EnumEntriesKt.enumEntries(a);
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{b, c};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) d.clone();
        }

        public c(String str, int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d b = new d("CANCELED", 0);
        public static final d c = new d("QUEUED", 1);
        public static final d d = new d("PROCESSING", 2);
        public static final /* synthetic */ d[] e;
        public static final /* synthetic */ EnumEntries f;

        static {
            d[] a = a();
            e = a;
            f = EnumEntriesKt.enumEntries(a);
        }

        public static final /* synthetic */ d[] a() {
            return new d[]{b, c, d};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) e.clone();
        }

        public d(String str, int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b b = new b("UI", 0);
        public static final b c = new b("ASYNC", 1);
        public static final /* synthetic */ b[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            b[] a = a();
            d = a;
            e = EnumEntriesKt.enumEntries(a);
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{b, c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }

        public b(String str, int i) {
        }
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
