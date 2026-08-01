package defpackage;

import android.app.Dialog;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.derinko.gbini.n1casino.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class lv extends m8 {
    public n8 o0;
    public lr p0;
    public lr q0;
    public fv r0;
    public String s0;
    public boolean t0;

    public lv() {
        List list = fv.h;
        this.s0 = (String) fv.h.get(0);
    }

    @Override // defpackage.mk
    public final void B(View view) {
        FrameLayout frameLayout;
        view.getClass();
        Dialog dialog = this.j0;
        l8 l8Var = dialog instanceof l8 ? (l8) dialog : null;
        final int i = 1;
        if (l8Var != null && (frameLayout = (FrameLayout) l8Var.findViewById(R.id.design_bottom_sheet)) != null) {
            BottomSheetBehavior C = BottomSheetBehavior.C(frameLayout);
            C.L(3);
            C.K = true;
        }
        fv fvVar = this.r0;
        final int i2 = 0;
        if (fvVar != null) {
            n8 n8Var = this.o0;
            n8Var.getClass();
            n8Var.g.setText(l(R.string.edit_note));
            n8 n8Var2 = this.o0;
            n8Var2.getClass();
            n8Var2.f.setText(fvVar.b);
            n8 n8Var3 = this.o0;
            n8Var3.getClass();
            n8Var3.e.setText(fvVar.c);
            n8 n8Var4 = this.o0;
            n8Var4.getClass();
            n8Var4.a.setVisibility(0);
        }
        M();
        n8 n8Var5 = this.o0;
        n8Var5.getClass();
        LinearLayout linearLayout = n8Var5.d;
        linearLayout.removeAllViews();
        int i3 = (int) (40.0f * k().getDisplayMetrics().density);
        int i4 = (int) (6.0f * k().getDisplayMetrics().density);
        int i5 = (int) (3.0f * k().getDisplayMetrics().density);
        Iterator it = fv.h.iterator();
        while (true) {
            final int i6 = 2;
            if (!it.hasNext()) {
                n8 n8Var6 = this.o0;
                n8Var6.getClass();
                n8Var6.b.setOnClickListener(new View.OnClickListener(this) { // from class: kv
                    public final /* synthetic */ lv g;

                    {
                        this.g = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        fv fvVar2;
                        String obj;
                        String obj2;
                        String obj3;
                        String obj4;
                        int i7 = i2;
                        lv lvVar = this.g;
                        switch (i7) {
                            case 0:
                                lvVar.t0 = !lvVar.t0;
                                lvVar.M();
                                break;
                            case 1:
                                fv fvVar3 = lvVar.r0;
                                if (fvVar3 != null) {
                                    String str = fvVar3.a;
                                    lr lrVar = lvVar.q0;
                                    if (lrVar != null) {
                                        lrVar.a(str);
                                    }
                                }
                                lvVar.L();
                                break;
                            default:
                                n8 n8Var7 = lvVar.o0;
                                n8Var7.getClass();
                                Editable text = n8Var7.f.getText();
                                String str2 = (text == null || (obj3 = text.toString()) == null || (obj4 = c40.y0(obj3).toString()) == null) ? "" : obj4;
                                n8 n8Var8 = lvVar.o0;
                                n8Var8.getClass();
                                Editable text2 = n8Var8.e.getText();
                                String str3 = (text2 == null || (obj = text2.toString()) == null || (obj2 = c40.y0(obj).toString()) == null) ? "" : obj2;
                                if (str2.length() != 0 || str3.length() != 0) {
                                    fv fvVar4 = lvVar.r0;
                                    if (fvVar4 != null) {
                                        fvVar2 = fv.a(fvVar4, str2, str3, lvVar.s0, lvVar.t0, System.currentTimeMillis(), 33);
                                    } else {
                                        String str4 = lvVar.s0;
                                        boolean z = lvVar.t0;
                                        String uuid = UUID.randomUUID().toString();
                                        uuid.getClass();
                                        fvVar2 = new fv(uuid, str2, str3, str4, z, System.currentTimeMillis(), System.currentTimeMillis());
                                    }
                                    lr lrVar2 = lvVar.p0;
                                    if (lrVar2 != null) {
                                        lrVar2.a(fvVar2);
                                    }
                                    lvVar.L();
                                    break;
                                } else {
                                    lvVar.L();
                                    break;
                                }
                                break;
                        }
                    }
                });
                n8 n8Var7 = this.o0;
                n8Var7.getClass();
                n8Var7.a.setOnClickListener(new View.OnClickListener(this) { // from class: kv
                    public final /* synthetic */ lv g;

                    {
                        this.g = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        fv fvVar2;
                        String obj;
                        String obj2;
                        String obj3;
                        String obj4;
                        int i7 = i;
                        lv lvVar = this.g;
                        switch (i7) {
                            case 0:
                                lvVar.t0 = !lvVar.t0;
                                lvVar.M();
                                break;
                            case 1:
                                fv fvVar3 = lvVar.r0;
                                if (fvVar3 != null) {
                                    String str = fvVar3.a;
                                    lr lrVar = lvVar.q0;
                                    if (lrVar != null) {
                                        lrVar.a(str);
                                    }
                                }
                                lvVar.L();
                                break;
                            default:
                                n8 n8Var72 = lvVar.o0;
                                n8Var72.getClass();
                                Editable text = n8Var72.f.getText();
                                String str2 = (text == null || (obj3 = text.toString()) == null || (obj4 = c40.y0(obj3).toString()) == null) ? "" : obj4;
                                n8 n8Var8 = lvVar.o0;
                                n8Var8.getClass();
                                Editable text2 = n8Var8.e.getText();
                                String str3 = (text2 == null || (obj = text2.toString()) == null || (obj2 = c40.y0(obj).toString()) == null) ? "" : obj2;
                                if (str2.length() != 0 || str3.length() != 0) {
                                    fv fvVar4 = lvVar.r0;
                                    if (fvVar4 != null) {
                                        fvVar2 = fv.a(fvVar4, str2, str3, lvVar.s0, lvVar.t0, System.currentTimeMillis(), 33);
                                    } else {
                                        String str4 = lvVar.s0;
                                        boolean z = lvVar.t0;
                                        String uuid = UUID.randomUUID().toString();
                                        uuid.getClass();
                                        fvVar2 = new fv(uuid, str2, str3, str4, z, System.currentTimeMillis(), System.currentTimeMillis());
                                    }
                                    lr lrVar2 = lvVar.p0;
                                    if (lrVar2 != null) {
                                        lrVar2.a(fvVar2);
                                    }
                                    lvVar.L();
                                    break;
                                } else {
                                    lvVar.L();
                                    break;
                                }
                                break;
                        }
                    }
                });
                n8 n8Var8 = this.o0;
                n8Var8.getClass();
                n8Var8.c.setOnClickListener(new View.OnClickListener(this) { // from class: kv
                    public final /* synthetic */ lv g;

                    {
                        this.g = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        fv fvVar2;
                        String obj;
                        String obj2;
                        String obj3;
                        String obj4;
                        int i7 = i6;
                        lv lvVar = this.g;
                        switch (i7) {
                            case 0:
                                lvVar.t0 = !lvVar.t0;
                                lvVar.M();
                                break;
                            case 1:
                                fv fvVar3 = lvVar.r0;
                                if (fvVar3 != null) {
                                    String str = fvVar3.a;
                                    lr lrVar = lvVar.q0;
                                    if (lrVar != null) {
                                        lrVar.a(str);
                                    }
                                }
                                lvVar.L();
                                break;
                            default:
                                n8 n8Var72 = lvVar.o0;
                                n8Var72.getClass();
                                Editable text = n8Var72.f.getText();
                                String str2 = (text == null || (obj3 = text.toString()) == null || (obj4 = c40.y0(obj3).toString()) == null) ? "" : obj4;
                                n8 n8Var82 = lvVar.o0;
                                n8Var82.getClass();
                                Editable text2 = n8Var82.e.getText();
                                String str3 = (text2 == null || (obj = text2.toString()) == null || (obj2 = c40.y0(obj).toString()) == null) ? "" : obj2;
                                if (str2.length() != 0 || str3.length() != 0) {
                                    fv fvVar4 = lvVar.r0;
                                    if (fvVar4 != null) {
                                        fvVar2 = fv.a(fvVar4, str2, str3, lvVar.s0, lvVar.t0, System.currentTimeMillis(), 33);
                                    } else {
                                        String str4 = lvVar.s0;
                                        boolean z = lvVar.t0;
                                        String uuid = UUID.randomUUID().toString();
                                        uuid.getClass();
                                        fvVar2 = new fv(uuid, str2, str3, str4, z, System.currentTimeMillis(), System.currentTimeMillis());
                                    }
                                    lr lrVar2 = lvVar.p0;
                                    if (lrVar2 != null) {
                                        lrVar2.a(fvVar2);
                                    }
                                    lvVar.L();
                                    break;
                                } else {
                                    lvVar.L();
                                    break;
                                }
                                break;
                        }
                    }
                });
                return;
            }
            String str = (String) it.next();
            View view2 = new View(E());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i3, i3);
            marginLayoutParams.setMargins(i4, i4, i4, i4);
            view2.setLayoutParams(marginLayoutParams);
            boolean b = zo.b(str, this.s0);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(Color.parseColor(str));
            if (b) {
                gradientDrawable.setStroke(i5, -16777216);
            }
            view2.setBackground(gradientDrawable);
            view2.setOnClickListener(new nr(this, str, i6));
            linearLayout.addView(view2);
        }
    }

    public final void M() {
        n8 n8Var = this.o0;
        n8Var.getClass();
        n8Var.b.setText(l(this.t0 ? R.string.unpin : R.string.pin));
        int parseColor = Color.parseColor(this.t0 ? "#E91E8C" : "#333333");
        n8 n8Var2 = this.o0;
        n8Var2.getClass();
        n8Var2.b.setTextColor(parseColor);
        n8 n8Var3 = this.o0;
        n8Var3.getClass();
        n8Var3.b.setIconTint(ColorStateList.valueOf(parseColor));
    }

    @Override // defpackage.qf, defpackage.mk
    public final void t(Bundle bundle) {
        String string;
        Object l00Var;
        super.t(bundle);
        Bundle bundle2 = this.k;
        if (bundle2 == null || (string = bundle2.getString("arg_note_json")) == null) {
            return;
        }
        try {
            List list = fv.h;
            l00Var = o8.u(new JSONObject(string));
        } catch (Throwable th) {
            l00Var = new l00(th);
        }
        if (l00Var instanceof l00) {
            return;
        }
        fv fvVar = (fv) l00Var;
        this.r0 = fvVar;
        this.s0 = fvVar.d;
        this.t0 = fvVar.e;
    }

    @Override // defpackage.mk
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_note, viewGroup, false);
        int i = R.id.btnDelete;
        MaterialButton materialButton = (MaterialButton) jw.r(inflate, R.id.btnDelete);
        if (materialButton != null) {
            i = R.id.btnPin;
            MaterialButton materialButton2 = (MaterialButton) jw.r(inflate, R.id.btnPin);
            if (materialButton2 != null) {
                i = R.id.btnSave;
                MaterialButton materialButton3 = (MaterialButton) jw.r(inflate, R.id.btnSave);
                if (materialButton3 != null) {
                    i = R.id.colorPickerRow;
                    LinearLayout linearLayout = (LinearLayout) jw.r(inflate, R.id.colorPickerRow);
                    if (linearLayout != null) {
                        i = R.id.etContent;
                        TextInputEditText textInputEditText = (TextInputEditText) jw.r(inflate, R.id.etContent);
                        if (textInputEditText != null) {
                            i = R.id.etTitle;
                            TextInputEditText textInputEditText2 = (TextInputEditText) jw.r(inflate, R.id.etTitle);
                            if (textInputEditText2 != null) {
                                i = R.id.tvSheetTitle;
                                TextView textView = (TextView) jw.r(inflate, R.id.tvSheetTitle);
                                if (textView != null) {
                                    LinearLayout linearLayout2 = (LinearLayout) inflate;
                                    this.o0 = new n8(linearLayout2, materialButton, materialButton2, materialButton3, linearLayout, textInputEditText, textInputEditText2, textView);
                                    linearLayout2.getClass();
                                    return linearLayout2;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.qf, defpackage.mk
    public final void v() {
        super.v();
        this.o0 = null;
    }
}
