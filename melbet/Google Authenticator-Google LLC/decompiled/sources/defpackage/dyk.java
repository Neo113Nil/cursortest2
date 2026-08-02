package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dyk extends ehm {
    public int a;
    public final jfg e;
    private final dyh f;
    private final dyt g;
    private final bst h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyk(bst bstVar, dyh dyhVar, dyt dytVar, ExecutorService executorService) {
        super(dja.G(executorService));
        executorService.getClass();
        this.h = bstVar;
        this.f = dyhVar;
        this.g = dytVar;
        this.a = 3;
        this.e = new jfg(v().size());
    }

    @Override // defpackage.ehm, defpackage.kr
    public final int a() {
        int size = v().size();
        int i = this.a;
        return size > i ? i : v().size();
    }

    @Override // defpackage.kr
    public final int b(int i) {
        return (i != this.a + (-1) || v().size() <= this.a) ? 0 : 1;
    }

    @Override // defpackage.kr
    public final lp d(ViewGroup viewGroup, int i) {
        if (i == 0) {
            bst bstVar = this.h;
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.og_bento_header_account, viewGroup, false);
            inflate.getClass();
            Object obj = bstVar.a;
            View findViewById = inflate.findViewById(R.id.og_bento_header_account_avatar);
            findViewById.getClass();
            return new gfx(inflate, ((fwm) obj).H((ViewGroup) findViewById));
        }
        if (i != 1) {
            throw new IllegalStateException("Unknown viewType in HeaderAvatarsAdapter.");
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.og_bento_header_remaining_accounts_number, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) inflate2.findViewById(R.id.og_bento_remaining_accounts_number_avatar_container);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(fhq.d(viewGroup.getContext(), R.attr.colorPrimaryContainer, 0));
        int i2 = yq.a;
        frameLayout.setBackground(shapeDrawable);
        inflate2.getClass();
        View findViewById2 = inflate2.findViewById(R.id.og_bento_remaining_accounts_number_avatar_text);
        findViewById2.getClass();
        return new gfx(inflate2, (TextView) findViewById2);
    }

    @Override // defpackage.kr
    public final void k(lp lpVar, int i) {
        lpVar.getClass();
        if (b(i) == 0) {
            this.f.c((gfx) lpVar, u(i));
        } else {
            this.g.c((gfx) lpVar, this.e);
        }
    }

    @Override // defpackage.ehm
    public final void t(List list) {
        super.t(list);
        this.e.b = list.size();
    }
}
