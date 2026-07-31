package androidx.room;

import android.content.Context;
import androidx.room.h;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import w.c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final c.InterfaceC0147c f1237a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1238b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1239c;

    /* renamed from: d, reason: collision with root package name */
    public final h.d f1240d;

    /* renamed from: e, reason: collision with root package name */
    public final List<h.b> f1241e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1242f;

    /* renamed from: g, reason: collision with root package name */
    public final h.c f1243g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f1244h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f1245i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1246j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1247k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1248l;

    /* renamed from: m, reason: collision with root package name */
    private final Set<Integer> f1249m;

    /* renamed from: n, reason: collision with root package name */
    public final String f1250n;

    /* renamed from: o, reason: collision with root package name */
    public final File f1251o;

    public a(Context context, String str, c.InterfaceC0147c interfaceC0147c, h.d dVar, List<h.b> list, boolean z6, h.c cVar, Executor executor, Executor executor2, boolean z7, boolean z8, boolean z9, Set<Integer> set, String str2, File file) {
        this.f1237a = interfaceC0147c;
        this.f1238b = context;
        this.f1239c = str;
        this.f1240d = dVar;
        this.f1241e = list;
        this.f1242f = z6;
        this.f1243g = cVar;
        this.f1244h = executor;
        this.f1245i = executor2;
        this.f1246j = z7;
        this.f1247k = z8;
        this.f1248l = z9;
        this.f1249m = set;
        this.f1250n = str2;
        this.f1251o = file;
    }

    public boolean a(int i7, int i8) {
        Set<Integer> set;
        return !((i7 > i8) && this.f1248l) && this.f1247k && ((set = this.f1249m) == null || !set.contains(Integer.valueOf(i7)));
    }
}
