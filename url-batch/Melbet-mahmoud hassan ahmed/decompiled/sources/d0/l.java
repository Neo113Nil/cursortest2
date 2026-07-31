package d0;

import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import d0.u;

/* loaded from: classes.dex */
public final class l extends u {

    public static final class a extends u.a<a, l> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f15508c.f18480d = OverwritingInputMerger.class.getName();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // d0.u.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public l c() {
            if (this.f15506a && Build.VERSION.SDK_INT >= 23 && this.f15508c.f18486j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new l(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // d0.u.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d() {
            return this;
        }
    }

    l(a aVar) {
        super(aVar.f15507b, aVar.f15508c, aVar.f15509d);
    }

    public static l d(Class<? extends ListenableWorker> cls) {
        return new a(cls).b();
    }
}
