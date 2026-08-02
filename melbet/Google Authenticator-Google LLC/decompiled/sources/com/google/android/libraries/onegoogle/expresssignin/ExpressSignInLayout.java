package com.google.android.libraries.onegoogle.expresssignin;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView;
import defpackage.csm;
import defpackage.dih;
import defpackage.drn;
import defpackage.ecs;
import defpackage.edj;
import defpackage.eea;
import defpackage.eed;
import defpackage.eeg;
import defpackage.eel;
import defpackage.fwm;
import defpackage.hoq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ExpressSignInLayout extends FrameLayout implements ecs {
    public eea a;
    private final fwm b;

    public ExpressSignInLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new fwm(this);
    }

    private final void b(edj edjVar) {
        this.b.F(new drn(this, edjVar, 7, null));
    }

    public final void a(final eed eedVar, final eeg eegVar) {
        hoq.I(!aH(), "initialize() has to be called only once.");
        dih dihVar = eegVar.b.h;
        Context context = getContext();
        context.getClass();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.SecondaryButton);
        TypedArray obtainStyledAttributes = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.isMaterial3Theme});
        try {
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            eea eeaVar = new eea(contextThemeWrapper, (eel) eegVar.b.f.c(!z ? new csm(13) : new csm(12)));
            this.a = eeaVar;
            super.addView(eeaVar, -1, new ViewGroup.LayoutParams(-1, -1));
            b(new edj() { // from class: edi
                @Override // defpackage.edj
                public final void a(final eea eeaVar2) {
                    int i;
                    String str;
                    View.OnClickListener onClickListener;
                    hel q;
                    eed eedVar2 = eed.this;
                    eeaVar2.e = eedVar2;
                    nw nwVar = (nw) dih.al(eeaVar2.getContext(), nw.class);
                    hoq.y(nwVar != null, "Express Sign In's onBackPressedDispatcherOwner has to be set or one of the context baseContexts should be a OnBackPressedDispatcherOwner");
                    eeaVar2.u = nwVar;
                    final eeg eegVar2 = eegVar;
                    eej eejVar = eegVar2.b;
                    gzp gzpVar = eejVar.b;
                    eeaVar2.p = (Button) eeaVar2.findViewById(R.id.continue_as_button);
                    eeaVar2.q = (Button) eeaVar2.findViewById(R.id.secondary_action_button);
                    eeaVar2.r = new edb(eeaVar2.q);
                    eeaVar2.s = new edb(eeaVar2.p);
                    efu efuVar = eedVar2.d;
                    efuVar.a(eeaVar2, 90569);
                    eeaVar2.b(efuVar);
                    eeaVar2.d = eejVar.g;
                    gzp gzpVar2 = eejVar.d;
                    if (gzpVar2.f()) {
                        gzpVar2.b();
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                        layoutParams.gravity = 17;
                        FrameLayout frameLayout = (FrameLayout) eeaVar2.findViewById(R.id.express_sign_in_header_logo_container);
                        Context context2 = eeaVar2.getContext();
                        ImageView imageView = new ImageView(context2);
                        imageView.setImageDrawable(e.f(context2, true != ecy.c(context2) ? R.drawable.googlelogo_light_color_74x24_vd : R.drawable.googlelogo_standard_color_74x24_vd));
                        frameLayout.addView(imageView, layoutParams);
                        frameLayout.setVisibility(0);
                    }
                    gzp gzpVar3 = eejVar.e;
                    cka ckaVar = (cka) eejVar.a.e();
                    if (ckaVar != null) {
                        drl drlVar = new drl(eeaVar2, eegVar2, 7, null);
                        Context context3 = eeaVar2.getContext();
                        hel s = hel.s(context3.getResources().getString(R.string.sign_in_app_name_without_account, ckaVar.a), context3.getResources().getString(R.string.sign_in_without_account), context3.getResources().getString(R.string.sign_in_without_account_short));
                        eeaVar2.c = true;
                        eeaVar2.r.a(s);
                        eeaVar2.q.setOnClickListener(drlVar);
                        eeaVar2.q.setVisibility(0);
                    }
                    eeaVar2.t = null;
                    eeh eehVar = eeaVar2.t;
                    gzp gzpVar4 = eejVar.c;
                    eeaVar2.x = eejVar.i;
                    if (gzpVar2.f()) {
                        Button button = eeaVar2.k;
                        ((ViewGroup.MarginLayoutParams) button.getLayoutParams()).topMargin = eeaVar2.getResources().getDimensionPixelSize(R.dimen.og_sign_in_button_with_google_logo_top_margin);
                        button.requestLayout();
                        View findViewById = eeaVar2.findViewById(R.id.esi_custom_header_container);
                        ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).topMargin = 0;
                        findViewById.requestLayout();
                    }
                    eeh eehVar2 = eeaVar2.t;
                    if (eeaVar2.c) {
                        Button button2 = eeaVar2.k;
                        ((ViewGroup.MarginLayoutParams) button2.getLayoutParams()).bottomMargin = 0;
                        button2.requestLayout();
                        ((ViewGroup.MarginLayoutParams) eeaVar2.p.getLayoutParams()).bottomMargin = 0;
                        eeaVar2.p.requestLayout();
                    }
                    eeaVar2.g.setOnClickListener(new drl(eeaVar2, efuVar, 8, null));
                    SelectedAccountView selectedAccountView = eeaVar2.j;
                    dpd dpdVar = eedVar2.b;
                    dov dovVar = eedVar2.e.a;
                    dqu a = dqu.a().a();
                    edo edoVar = new edo(eeaVar2, 0);
                    String string = eeaVar2.getResources().getString(R.string.og_collapse_account_list_a11y);
                    String string2 = eeaVar2.getResources().getString(R.string.og_expand_account_list_a11y);
                    selectedAccountView.o = a;
                    selectedAccountView.e();
                    selectedAccountView.s = new fym(selectedAccountView, dovVar, a);
                    selectedAccountView.i.f(dpdVar, dovVar);
                    selectedAccountView.p = string;
                    selectedAccountView.q = string2;
                    selectedAccountView.r = edoVar;
                    selectedAccountView.n = false;
                    selectedAccountView.j.setRotation(360.0f);
                    selectedAccountView.j(false);
                    edp edpVar = new edp(eeaVar2, eedVar2);
                    eeaVar2.getContext();
                    gyf gyfVar = gyf.a;
                    if (dovVar == null) {
                        throw new NullPointerException("Null accountConverter");
                    }
                    drb drbVar = eedVar2.a;
                    if (drbVar == null) {
                        throw new NullPointerException("Null accountsModel");
                    }
                    if (dpdVar == null) {
                        throw new NullPointerException("Null avatarImageLoader");
                    }
                    efc efcVar = eedVar2.c;
                    if (efcVar == null) {
                        throw new NullPointerException("Null oneGoogleEventLogger");
                    }
                    dre dreVar = new dre(dpdVar, dovVar, drbVar, efcVar, gyfVar, gyfVar);
                    jnu a2 = eea.a();
                    int i2 = eeaVar2.f.c;
                    ecq ecqVar = null;
                    dri driVar = new dri(dreVar, edpVar, a2, efuVar, i2, dqu.a().a());
                    Context context4 = eeaVar2.getContext();
                    dou douVar = new dou() { // from class: edl
                        @Override // defpackage.dou
                        public final void a(View view, Object obj) {
                            eea eeaVar3 = eea.this;
                            eeaVar3.g(view);
                            eeaVar3.i(false);
                        }
                    };
                    Context context5 = eeaVar2.getContext();
                    if (dih.ap(context5)) {
                        ecp ecpVar = new ecp();
                        i = 4;
                        ecpVar.a(R.id.og_ai_not_set);
                        ecpVar.c = -1;
                        ecpVar.h = (byte) (ecpVar.h | 2);
                        ecpVar.b(-1);
                        ecpVar.a(R.id.og_ai_add_another_account);
                        Drawable f = e.f(context5, R.drawable.quantum_gm_ic_person_add_vd_theme_24);
                        f.getClass();
                        ecpVar.b = f;
                        String string3 = context5.getString(R.string.og_add_another_account);
                        if (string3 == null) {
                            throw new NullPointerException("Null label");
                        }
                        ecpVar.d = string3;
                        ecpVar.f = new drl(douVar, drbVar, 5, null);
                        ecpVar.b(90141);
                        if ((ecpVar.h & 1) == 0) {
                            throw new IllegalStateException("Property \"id\" has not been set");
                        }
                        hoq.I(ecpVar.a != R.id.og_ai_not_set, "Did you forget to setId()?");
                        if ((ecpVar.h & 4) == 0) {
                            throw new IllegalStateException("Property \"veId\" has not been set");
                        }
                        hoq.I(ecpVar.e != -1, "Did you forget to setVeId()?");
                        if ((ecpVar.h & 2) == 0) {
                            throw new IllegalStateException("Property \"iconResId\" has not been set");
                        }
                        hoq.I((ecpVar.c != -1) ^ (ecpVar.b != null), "Either icon id or icon drawable must be specified");
                        if (ecpVar.h != 7 || (str = ecpVar.d) == null || (onClickListener = ecpVar.f) == null) {
                            StringBuilder sb = new StringBuilder();
                            if ((ecpVar.h & 1) == 0) {
                                sb.append(" id");
                            }
                            if ((ecpVar.h & 2) == 0) {
                                sb.append(" iconResId");
                            }
                            if (ecpVar.d == null) {
                                sb.append(" label");
                            }
                            if ((ecpVar.h & 4) == 0) {
                                sb.append(" veId");
                            }
                            if (ecpVar.f == null) {
                                sb.append(" onClickListener");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                        }
                        ecqVar = new ecq(ecpVar.a, ecpVar.b, ecpVar.c, str, ecpVar.e, onClickListener, ecpVar.g);
                    } else {
                        i = 4;
                    }
                    if (ecqVar == null) {
                        int i3 = hel.d;
                        q = his.a;
                    } else {
                        q = hel.q(ecqVar);
                    }
                    edf edfVar = new edf(context4, q, efuVar, i2);
                    eea.l(eeaVar2.h, driVar);
                    eea.l(eeaVar2.i, edfVar);
                    eeaVar2.c(driVar, edfVar);
                    edu eduVar = new edu(eeaVar2, driVar, edfVar);
                    driVar.r(eduVar);
                    edfVar.r(eduVar);
                    eeaVar2.p.setOnClickListener(new edk(eeaVar2, efuVar, eegVar2, eedVar2, 2));
                    eeaVar2.k.setOnClickListener(new edk(eeaVar2, efuVar, eedVar2, new dra() { // from class: edq
                        @Override // defpackage.dra
                        public final void a(hel helVar, Object obj) {
                            if (helVar.size() == 1) {
                                dih.W(new ajx(eea.this, eegVar2, obj, 16, (int[]) null));
                            }
                        }
                    }, 0));
                    abb abbVar = new abb(eeaVar2, eedVar2, i);
                    eeaVar2.addOnAttachStateChangeListener(abbVar);
                    fu fuVar = new fu(eeaVar2, 5);
                    eeaVar2.addOnAttachStateChangeListener(fuVar);
                    int i4 = yq.a;
                    if (eeaVar2.isAttachedToWindow()) {
                        abbVar.onViewAttachedToWindow(eeaVar2);
                        fuVar.onViewAttachedToWindow(eeaVar2);
                    }
                    eeaVar2.h(false);
                }
            });
            this.b.E();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // defpackage.ecs
    public final boolean aH() {
        return this.a != null;
    }

    @Override // android.view.ViewGroup
    public final void addView(final View view, final int i, final ViewGroup.LayoutParams layoutParams) {
        b(new edj() { // from class: edh
            @Override // defpackage.edj
            public final void a(eea eeaVar) {
                eeaVar.addView(view, i, layoutParams);
            }
        });
    }

    public ExpressSignInLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpressSignInLayout(Context context) {
        this(context, null);
    }
}
