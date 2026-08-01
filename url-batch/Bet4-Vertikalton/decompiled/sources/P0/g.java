package P0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.playbag.tripgear.R;
import g0.AbstractC0112D;
import g0.c0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g extends AbstractC0112D {
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final c f691e;

    /* renamed from: f, reason: collision with root package name */
    public final c f692f;

    public g(ArrayList arrayList, c cVar, c cVar2) {
        this.d = arrayList;
        this.f691e = cVar;
        this.f692f = cVar2;
    }

    @Override // g0.AbstractC0112D
    public final int a() {
        return this.d.size();
    }

    @Override // g0.AbstractC0112D
    public final void c(c0 c0Var, int i) {
        final f fVar = (f) c0Var;
        final h hVar = (h) this.d.get(i);
        H.e eVar = fVar.f690u;
        ((TextView) eVar.f263f).setText(hVar.f693a);
        boolean z2 = hVar.f694b;
        TextView textView = (TextView) eVar.f263f;
        ImageView imageView = (ImageView) eVar.d;
        LinearLayout linearLayout = (LinearLayout) eVar.f262e;
        LinearLayout linearLayout2 = (LinearLayout) eVar.f260b;
        if (z2) {
            imageView.setVisibility(0);
            textView.setTextColor(A.b.a(linearLayout2.getContext(), R.color.neon_green));
            linearLayout.setAlpha(0.75f);
        } else {
            imageView.setVisibility(4);
            textView.setTextColor(A.b.a(linearLayout2.getContext(), R.color.text_primary));
            linearLayout.setAlpha(1.0f);
        }
        TextView textView2 = (TextView) eVar.f261c;
        if (hVar.f695c) {
            textView2.setVisibility(0);
            final int i2 = 0;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: P0.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g f688b;

                {
                    this.f688b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            this.f688b.f692f.c(hVar, Integer.valueOf(fVar.b()));
                            break;
                        default:
                            this.f688b.f691e.c(hVar, Integer.valueOf(fVar.b()));
                            break;
                    }
                }
            });
        } else {
            textView2.setVisibility(8);
            textView2.setOnClickListener(null);
        }
        final int i3 = 1;
        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: P0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f688b;

            {
                this.f688b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f688b.f692f.c(hVar, Integer.valueOf(fVar.b()));
                        break;
                    default:
                        this.f688b.f691e.c(hVar, Integer.valueOf(fVar.b()));
                        break;
                }
            }
        });
    }

    @Override // g0.AbstractC0112D
    public final c0 d(ViewGroup viewGroup) {
        d1.d.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_checklist, viewGroup, false);
        int i = R.id.btnRemove;
        TextView textView = (TextView) h1.d.f(inflate, R.id.btnRemove);
        if (textView != null) {
            i = R.id.ivCheck;
            ImageView imageView = (ImageView) h1.d.f(inflate, R.id.ivCheck);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                i = R.id.tvItemName;
                TextView textView2 = (TextView) h1.d.f(inflate, R.id.tvItemName);
                if (textView2 != null) {
                    return new f(new H.e(linearLayout, textView, imageView, linearLayout, textView2));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
