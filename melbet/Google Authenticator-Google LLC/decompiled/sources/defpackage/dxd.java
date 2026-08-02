package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.authenticator2.R;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxd extends ehm {
    private final dxj a;
    private final ekx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxd(ekx ekxVar, dxj dxjVar, ExecutorService executorService) {
        super(dja.G(executorService));
        executorService.getClass();
        this.e = ekxVar;
        this.a = dxjVar;
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ lp d(ViewGroup viewGroup, int i) {
        int i2 = 0;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.og_bento_available_account, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.og_bento_available_account_card_container);
        FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(R.id.og_bento_available_account_trailing_container);
        FrameLayout frameLayout3 = (FrameLayout) inflate.findViewById(R.id.og_bento_available_account_avatar);
        TextView textView = (TextView) inflate.findViewById(R.id.og_primary_account_information);
        TextView textView2 = (TextView) inflate.findViewById(R.id.og_secondary_account_information);
        ekx ekxVar = this.e;
        if (!((bst) ekxVar.a).j()) {
            inflate.getClass();
            frameLayout3.getClass();
            textView.getClass();
            textView2.getClass();
            int dimensionPixelSize = inflate.getResources().getDimensionPixelSize(R.dimen.bento_available_account_avatar_size_legacy);
            ViewGroup.LayoutParams layoutParams = frameLayout3.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            frameLayout3.setLayoutParams(layoutParams);
            int dimensionPixelSize2 = inflate.getResources().getDimensionPixelSize(R.dimen.bento_available_account_vertical_padding_legacy);
            inflate.setPaddingRelative(inflate.getResources().getDimensionPixelSize(R.dimen.bento_available_account_padding_start_legacy), dimensionPixelSize2, inflate.getPaddingEnd(), dimensionPixelSize2);
            int dimensionPixelSize3 = inflate.getResources().getDimensionPixelSize(R.dimen.bento_available_account_distance_between_avatar_and_texts_legacy);
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            td tdVar = (td) layoutParams2;
            tdVar.setMarginStart(dimensionPixelSize3);
            textView.setLayoutParams(tdVar);
            ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            td tdVar2 = (td) layoutParams3;
            tdVar2.setMarginStart(dimensionPixelSize3);
            textView2.setLayoutParams(tdVar2);
        }
        inflate.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        Object obj = ekxVar.b;
        frameLayout3.getClass();
        dze H = ((fwm) obj).H(frameLayout3);
        textView.getClass();
        textView2.getClass();
        byte[] bArr = null;
        hac v = hoq.v(new dxi(ekxVar, frameLayout2, i2, bArr));
        frameLayout.getClass();
        frameLayout2.getClass();
        return new dxk(constraintLayout, H, textView, textView2, v, frameLayout2, frameLayout, hoq.v(new dxi(ekxVar, frameLayout, 2, bArr)));
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ void k(lp lpVar, int i) {
        dxk dxkVar = (dxk) lpVar;
        dxkVar.getClass();
        this.a.c(dxkVar, u(i));
    }
}
