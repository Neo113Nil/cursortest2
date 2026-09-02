package v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.k0;
import androidx.fragment.app.u;
import com.oriondriftchasers.arordrft.R;
import l.h3;
import w2.h;
import w2.j;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b extends u {
    public h3 Y;

    public final void G(u uVar) {
        k0 g4 = g();
        g4.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(g4);
        aVar.f(R.id.game_content_container, uVar, null, 2);
        aVar.d(false);
    }

    @Override // androidx.fragment.app.u
    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        f3.d.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_game_tycoon, viewGroup, false);
        int i = R.id.game_content_container;
        if (((FrameLayout) h.a.s(inflate, R.id.game_content_container)) != null) {
            i = R.id.game_dashboard_button;
            Button button = (Button) h.a.s(inflate, R.id.game_dashboard_button);
            if (button != null) {
                i = R.id.game_garage_button;
                Button button2 = (Button) h.a.s(inflate, R.id.game_garage_button);
                if (button2 != null) {
                    i = R.id.game_missions_button;
                    Button button3 = (Button) h.a.s(inflate, R.id.game_missions_button);
                    if (button3 != null) {
                        i = R.id.game_navigation_scroll;
                        if (((HorizontalScrollView) h.a.s(inflate, R.id.game_navigation_scroll)) != null) {
                            i = R.id.game_races_button;
                            Button button4 = (Button) h.a.s(inflate, R.id.game_races_button);
                            if (button4 != null) {
                                i = R.id.game_shop_button;
                                Button button5 = (Button) h.a.s(inflate, R.id.game_shop_button);
                                if (button5 != null) {
                                    i = R.id.game_title_header;
                                    if (((TextView) h.a.s(inflate, R.id.game_title_header)) != null) {
                                        i = R.id.game_upgrades_button;
                                        Button button6 = (Button) h.a.s(inflate, R.id.game_upgrades_button);
                                        if (button6 != null) {
                                            this.Y = new h3((ConstraintLayout) inflate, button, button2, button3, button4, button5, button6);
                                            C().getSharedPreferences("game_storage_prefs", 0);
                                            h3 h3Var = this.Y;
                                            f3.d.b(h3Var);
                                            ConstraintLayout constraintLayout = (ConstraintLayout) h3Var.f2337a;
                                            f3.d.d(constraintLayout, "getRoot(...)");
                                            return constraintLayout;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.u
    public final void t() {
        this.H = true;
        this.Y = null;
    }

    @Override // androidx.fragment.app.u
    public final void z(View view, Bundle bundle) {
        f3.d.e(view, "view");
        if (bundle == null) {
            G(new w2.b());
        }
        h3 h3Var = this.Y;
        f3.d.b(h3Var);
        final int i = 0;
        ((Button) h3Var.f2338b).setOnClickListener(new View.OnClickListener(this) { // from class: v2.a

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ b f3507g;

            {
                this.f3507g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        this.f3507g.G(new w2.b());
                        break;
                    case 1:
                        this.f3507g.G(new w2.d());
                        break;
                    case 2:
                        this.f3507g.G(new w2.g());
                        break;
                    case 3:
                        this.f3507g.G(new j());
                        break;
                    case 4:
                        this.f3507g.G(new h());
                        break;
                    default:
                        this.f3507g.G(new w2.e());
                        break;
                }
            }
        });
        h3 h3Var2 = this.Y;
        f3.d.b(h3Var2);
        final int i4 = 1;
        ((Button) h3Var2.f2339c).setOnClickListener(new View.OnClickListener(this) { // from class: v2.a

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ b f3507g;

            {
                this.f3507g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        this.f3507g.G(new w2.b());
                        break;
                    case 1:
                        this.f3507g.G(new w2.d());
                        break;
                    case 2:
                        this.f3507g.G(new w2.g());
                        break;
                    case 3:
                        this.f3507g.G(new j());
                        break;
                    case 4:
                        this.f3507g.G(new h());
                        break;
                    default:
                        this.f3507g.G(new w2.e());
                        break;
                }
            }
        });
        h3 h3Var3 = this.Y;
        f3.d.b(h3Var3);
        final int i5 = 2;
        ((Button) h3Var3.f2340e).setOnClickListener(new View.OnClickListener(this) { // from class: v2.a

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ b f3507g;

            {
                this.f3507g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i5) {
                    case 0:
                        this.f3507g.G(new w2.b());
                        break;
                    case 1:
                        this.f3507g.G(new w2.d());
                        break;
                    case 2:
                        this.f3507g.G(new w2.g());
                        break;
                    case 3:
                        this.f3507g.G(new j());
                        break;
                    case 4:
                        this.f3507g.G(new h());
                        break;
                    default:
                        this.f3507g.G(new w2.e());
                        break;
                }
            }
        });
        h3 h3Var4 = this.Y;
        f3.d.b(h3Var4);
        final int i6 = 3;
        ((Button) h3Var4.f2342g).setOnClickListener(new View.OnClickListener(this) { // from class: v2.a

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ b f3507g;

            {
                this.f3507g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        this.f3507g.G(new w2.b());
                        break;
                    case 1:
                        this.f3507g.G(new w2.d());
                        break;
                    case 2:
                        this.f3507g.G(new w2.g());
                        break;
                    case 3:
                        this.f3507g.G(new j());
                        break;
                    case 4:
                        this.f3507g.G(new h());
                        break;
                    default:
                        this.f3507g.G(new w2.e());
                        break;
                }
            }
        });
        h3 h3Var5 = this.Y;
        f3.d.b(h3Var5);
        final int i7 = 4;
        ((Button) h3Var5.f2341f).setOnClickListener(new View.OnClickListener(this) { // from class: v2.a

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ b f3507g;

            {
                this.f3507g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i7) {
                    case 0:
                        this.f3507g.G(new w2.b());
                        break;
                    case 1:
                        this.f3507g.G(new w2.d());
                        break;
                    case 2:
                        this.f3507g.G(new w2.g());
                        break;
                    case 3:
                        this.f3507g.G(new j());
                        break;
                    case 4:
                        this.f3507g.G(new h());
                        break;
                    default:
                        this.f3507g.G(new w2.e());
                        break;
                }
            }
        });
        h3 h3Var6 = this.Y;
        f3.d.b(h3Var6);
        final int i8 = 5;
        ((Button) h3Var6.d).setOnClickListener(new View.OnClickListener(this) { // from class: v2.a

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ b f3507g;

            {
                this.f3507g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i8) {
                    case 0:
                        this.f3507g.G(new w2.b());
                        break;
                    case 1:
                        this.f3507g.G(new w2.d());
                        break;
                    case 2:
                        this.f3507g.G(new w2.g());
                        break;
                    case 3:
                        this.f3507g.G(new j());
                        break;
                    case 4:
                        this.f3507g.G(new h());
                        break;
                    default:
                        this.f3507g.G(new w2.e());
                        break;
                }
            }
        });
    }
}
