package k4;

import android.content.Context;
import c4.b1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18217a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18218b;

    /* renamed from: k4.a$a, reason: collision with other inner class name */
    public static class C0085a {

        /* renamed from: b, reason: collision with root package name */
        private final Context f18220b;

        /* renamed from: d, reason: collision with root package name */
        private boolean f18222d;

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f18219a = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private int f18221c = 0;

        public C0085a(Context context) {
            this.f18220b = context.getApplicationContext();
        }

        public C0085a a(String str) {
            this.f18219a.add(str);
            return this;
        }

        public a b() {
            return new a((b1.c() || this.f18219a.contains(b1.a(this.f18220b))) || this.f18222d, this);
        }

        public C0085a c(int i7) {
            this.f18221c = i7;
            return this;
        }
    }

    private a(boolean z6, C0085a c0085a) {
        this.f18217a = z6;
        this.f18218b = c0085a.f18221c;
    }

    public int a() {
        return this.f18218b;
    }

    public boolean b() {
        return this.f18217a;
    }
}
