package c3;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private String f1898a;

    /* renamed from: b, reason: collision with root package name */
    private List<u2.d> f1899b;

    /* renamed from: c, reason: collision with root package name */
    private String f1900c;

    /* renamed from: d, reason: collision with root package name */
    private u2.d f1901d;

    /* renamed from: e, reason: collision with root package name */
    private String f1902e;

    /* renamed from: f, reason: collision with root package name */
    private String f1903f;

    /* renamed from: g, reason: collision with root package name */
    private Double f1904g;

    /* renamed from: h, reason: collision with root package name */
    private String f1905h;

    /* renamed from: i, reason: collision with root package name */
    private String f1906i;

    /* renamed from: j, reason: collision with root package name */
    private r2.w f1907j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1908k;

    /* renamed from: l, reason: collision with root package name */
    private View f1909l;

    /* renamed from: m, reason: collision with root package name */
    private View f1910m;

    /* renamed from: n, reason: collision with root package name */
    private Object f1911n;

    /* renamed from: o, reason: collision with root package name */
    private Bundle f1912o = new Bundle();

    /* renamed from: p, reason: collision with root package name */
    private boolean f1913p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f1914q;

    /* renamed from: r, reason: collision with root package name */
    private float f1915r;

    public final void A(boolean z6) {
        this.f1913p = z6;
    }

    public final void B(@RecentlyNonNull String str) {
        this.f1906i = str;
    }

    public final void C(@RecentlyNonNull Double d7) {
        this.f1904g = d7;
    }

    public final void D(@RecentlyNonNull String str) {
        this.f1905h = str;
    }

    public abstract void E(@RecentlyNonNull View view, @RecentlyNonNull Map<String, View> map, @RecentlyNonNull Map<String, View> map2);

    public void F(@RecentlyNonNull View view) {
    }

    @RecentlyNonNull
    public final View G() {
        return this.f1910m;
    }

    @RecentlyNonNull
    public final r2.w H() {
        return this.f1907j;
    }

    @RecentlyNonNull
    public final Object I() {
        return this.f1911n;
    }

    public final void J(@RecentlyNonNull Object obj) {
        this.f1911n = obj;
    }

    public final void K(@RecentlyNonNull r2.w wVar) {
        this.f1907j = wVar;
    }

    @RecentlyNonNull
    public View a() {
        return this.f1909l;
    }

    @RecentlyNonNull
    public final String b() {
        return this.f1903f;
    }

    @RecentlyNonNull
    public final String c() {
        return this.f1900c;
    }

    @RecentlyNonNull
    public final String d() {
        return this.f1902e;
    }

    public float e() {
        return 0.0f;
    }

    public float f() {
        return 0.0f;
    }

    @RecentlyNonNull
    public final Bundle g() {
        return this.f1912o;
    }

    @RecentlyNonNull
    public final String h() {
        return this.f1898a;
    }

    @RecentlyNonNull
    public final u2.d i() {
        return this.f1901d;
    }

    @RecentlyNonNull
    public final List<u2.d> j() {
        return this.f1899b;
    }

    public float k() {
        return this.f1915r;
    }

    public final boolean l() {
        return this.f1914q;
    }

    public final boolean m() {
        return this.f1913p;
    }

    @RecentlyNonNull
    public final String n() {
        return this.f1906i;
    }

    @RecentlyNonNull
    public final Double o() {
        return this.f1904g;
    }

    @RecentlyNonNull
    public final String p() {
        return this.f1905h;
    }

    public void q(@RecentlyNonNull View view) {
    }

    public boolean r() {
        return this.f1908k;
    }

    public void s() {
    }

    public final void t(@RecentlyNonNull String str) {
        this.f1903f = str;
    }

    public final void u(@RecentlyNonNull String str) {
        this.f1900c = str;
    }

    public final void v(@RecentlyNonNull String str) {
        this.f1902e = str;
    }

    public final void w(@RecentlyNonNull String str) {
        this.f1898a = str;
    }

    public final void x(@RecentlyNonNull u2.d dVar) {
        this.f1901d = dVar;
    }

    public final void y(@RecentlyNonNull List<u2.d> list) {
        this.f1899b = list;
    }

    public final void z(boolean z6) {
        this.f1914q = z6;
    }
}
