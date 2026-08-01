package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.moontiko.really.admiralcasino.R;
import com.moontiko.really.admiralcasino.data.Note;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class d2 extends a9 {
    public p8 o0;
    public Note r0;
    public boolean u0;
    public final a80 p0 = new a80(new a2(0, this));
    public final List q0 = xb.i0("#FAFAFA", "#FF6B6B", "#6BCB77", "#4D96FF", "#C77DFF", "#FFD166");
    public String s0 = "#FAFAFA";
    public String t0 = "Personal";

    @Override // defpackage.pm
    public final void A(View view) {
        view.getClass();
        Dialog dialog = this.j0;
        z8 z8Var = dialog instanceof z8 ? (z8) dialog : null;
        final int i = 1;
        if (z8Var != null) {
            if (z8Var.l == null) {
                z8Var.h();
            }
            BottomSheetBehavior bottomSheetBehavior = z8Var.l;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.L(3);
                bottomSheetBehavior.K = true;
            }
        }
        Bundle bundle = this.k;
        final int i2 = 0;
        if (bundle != null) {
            int i3 = bundle.getInt("id");
            String string = bundle.getString("title", "");
            string.getClass();
            String string2 = bundle.getString("content", "");
            string2.getClass();
            String string3 = bundle.getString("colorHex", "#FAFAFA");
            string3.getClass();
            String string4 = bundle.getString("category", "Personal");
            string4.getClass();
            Note note = new Note(i3, string, string2, string3, string4, bundle.getBoolean("isPinned", false), bundle.getLong("createdAt"), bundle.getLong("updatedAt"));
            this.s0 = note.getColorHex();
            this.t0 = note.getCategory();
            this.u0 = note.isPinned();
            p8 p8Var = this.o0;
            p8Var.getClass();
            p8Var.m.setText(R.string.edit_note);
            p8 p8Var2 = this.o0;
            p8Var2.getClass();
            p8Var2.l.setText(note.getTitle());
            p8 p8Var3 = this.o0;
            p8Var3.getClass();
            p8Var3.k.setText(note.getContent());
            p8 p8Var4 = this.o0;
            p8Var4.getClass();
            p8Var4.a.setVisibility(0);
            this.r0 = note;
        }
        p8 p8Var5 = this.o0;
        p8Var5.getClass();
        MaterialCardView materialCardView = p8Var5.f;
        p8 p8Var6 = this.o0;
        p8Var6.getClass();
        MaterialCardView materialCardView2 = p8Var6.e;
        p8 p8Var7 = this.o0;
        p8Var7.getClass();
        MaterialCardView materialCardView3 = p8Var7.i;
        p8 p8Var8 = this.o0;
        p8Var8.getClass();
        MaterialCardView materialCardView4 = p8Var8.j;
        p8 p8Var9 = this.o0;
        p8Var9.getClass();
        MaterialCardView materialCardView5 = p8Var9.h;
        p8 p8Var10 = this.o0;
        p8Var10.getClass();
        final List i0 = xb.i0(materialCardView, materialCardView2, materialCardView3, materialCardView4, materialCardView5, p8Var10.g);
        final int i4 = 0;
        for (Object obj : i0) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                xb.j0();
                throw null;
            }
            ((MaterialCardView) obj).setOnClickListener(new View.OnClickListener() { // from class: b2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d2 d2Var = d2.this;
                    List list = d2Var.q0;
                    int i6 = i4;
                    d2Var.s0 = (String) list.get(i6);
                    d2Var.M(i0, i6);
                }
            });
            i4 = i5;
        }
        int indexOf = this.q0.indexOf(this.s0);
        if (indexOf < 0) {
            indexOf = 0;
        }
        M(i0, indexOf);
        tz[] tzVarArr = {new tz(k(R.string.category_personal), Integer.valueOf(R.id.chipPersonal)), new tz(k(R.string.category_work), Integer.valueOf(R.id.chipWork)), new tz(k(R.string.category_ideas), Integer.valueOf(R.id.chipIdeas)), new tz(k(R.string.category_study), Integer.valueOf(R.id.chipStudy)), new tz(k(R.string.category_other), Integer.valueOf(R.id.chipOther))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(pu.p0(5));
        for (int i6 = 0; i6 < 5; i6++) {
            tz tzVar = tzVarArr[i6];
            linkedHashMap.put(tzVar.f, tzVar.g);
        }
        Integer num = (Integer) linkedHashMap.get(this.t0);
        if (num != null) {
            int intValue = num.intValue();
            p8 p8Var11 = this.o0;
            p8Var11.getClass();
            ma maVar = p8Var11.d.m;
            Chip chip = (Chip) maVar.a.get(Integer.valueOf(intValue));
            if (chip != null && maVar.a(chip)) {
                maVar.d();
            }
        }
        p8 p8Var12 = this.o0;
        p8Var12.getClass();
        p8Var12.d.setOnCheckedStateChangeListener(new c2(i2, this));
        p8 p8Var13 = this.o0;
        p8Var13.getClass();
        p8Var13.b.setIconResource(this.u0 ? R.drawable.ic_pin_filled : R.drawable.ic_pin_outline);
        p8 p8Var14 = this.o0;
        p8Var14.getClass();
        final int i7 = 2;
        p8Var14.b.setOnClickListener(new View.OnClickListener(this) { // from class: z1
            public final /* synthetic */ d2 g;

            {
                this.g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Note note2;
                String obj2;
                String obj3;
                int i8 = i7;
                d2 d2Var = this.g;
                switch (i8) {
                    case 0:
                        p8 p8Var15 = d2Var.o0;
                        p8Var15.getClass();
                        Editable text = p8Var15.l.getText();
                        String obj4 = (text == null || (obj3 = text.toString()) == null) ? null : f70.g0(obj3).toString();
                        String str = obj4 == null ? "" : obj4;
                        p8 p8Var16 = d2Var.o0;
                        p8Var16.getClass();
                        Editable text2 = p8Var16.k.getText();
                        String obj5 = (text2 == null || (obj2 = text2.toString()) == null) ? null : f70.g0(obj2).toString();
                        String str2 = obj5 == null ? "" : obj5;
                        if (str.length() != 0 || str2.length() != 0) {
                            Note note3 = d2Var.r0;
                            if (note3 == null || (note2 = Note.copy$default(note3, 0, str, str2, d2Var.s0, d2Var.t0, d2Var.u0, 0L, System.currentTimeMillis(), 65, null)) == null) {
                                note2 = new Note(0, str, str2, d2Var.s0, d2Var.t0, d2Var.u0, 0L, 0L, 193, null);
                            }
                            Note note4 = d2Var.r0;
                            a80 a80Var = d2Var.p0;
                            if (note4 != null) {
                                ry ryVar = (ry) a80Var.a();
                                ryVar.getClass();
                                tb E = kr.E(ryVar);
                                og ogVar = zh.a;
                                mz.z(E, eg.h, new py(ryVar, note2, null, 2));
                            } else {
                                ry ryVar2 = (ry) a80Var.a();
                                ryVar2.getClass();
                                tb E2 = kr.E(ryVar2);
                                og ogVar2 = zh.a;
                                mz.z(E2, eg.h, new py(ryVar2, note2, null, 1));
                            }
                            d2Var.L();
                            break;
                        } else {
                            d2Var.L();
                            break;
                        }
                        break;
                    case 1:
                        Note note5 = d2Var.r0;
                        if (note5 != null) {
                            ry ryVar3 = (ry) d2Var.p0.a();
                            ryVar3.getClass();
                            tb E3 = kr.E(ryVar3);
                            og ogVar3 = zh.a;
                            mz.z(E3, eg.h, new py(ryVar3, note5, null, 0));
                        }
                        d2Var.L();
                        break;
                    default:
                        d2Var.u0 = !d2Var.u0;
                        p8 p8Var17 = d2Var.o0;
                        p8Var17.getClass();
                        p8Var17.b.setIconResource(d2Var.u0 ? R.drawable.ic_pin_filled : R.drawable.ic_pin_outline);
                        break;
                }
            }
        });
        p8 p8Var15 = this.o0;
        p8Var15.getClass();
        p8Var15.c.setOnClickListener(new View.OnClickListener(this) { // from class: z1
            public final /* synthetic */ d2 g;

            {
                this.g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Note note2;
                String obj2;
                String obj3;
                int i8 = i2;
                d2 d2Var = this.g;
                switch (i8) {
                    case 0:
                        p8 p8Var152 = d2Var.o0;
                        p8Var152.getClass();
                        Editable text = p8Var152.l.getText();
                        String obj4 = (text == null || (obj3 = text.toString()) == null) ? null : f70.g0(obj3).toString();
                        String str = obj4 == null ? "" : obj4;
                        p8 p8Var16 = d2Var.o0;
                        p8Var16.getClass();
                        Editable text2 = p8Var16.k.getText();
                        String obj5 = (text2 == null || (obj2 = text2.toString()) == null) ? null : f70.g0(obj2).toString();
                        String str2 = obj5 == null ? "" : obj5;
                        if (str.length() != 0 || str2.length() != 0) {
                            Note note3 = d2Var.r0;
                            if (note3 == null || (note2 = Note.copy$default(note3, 0, str, str2, d2Var.s0, d2Var.t0, d2Var.u0, 0L, System.currentTimeMillis(), 65, null)) == null) {
                                note2 = new Note(0, str, str2, d2Var.s0, d2Var.t0, d2Var.u0, 0L, 0L, 193, null);
                            }
                            Note note4 = d2Var.r0;
                            a80 a80Var = d2Var.p0;
                            if (note4 != null) {
                                ry ryVar = (ry) a80Var.a();
                                ryVar.getClass();
                                tb E = kr.E(ryVar);
                                og ogVar = zh.a;
                                mz.z(E, eg.h, new py(ryVar, note2, null, 2));
                            } else {
                                ry ryVar2 = (ry) a80Var.a();
                                ryVar2.getClass();
                                tb E2 = kr.E(ryVar2);
                                og ogVar2 = zh.a;
                                mz.z(E2, eg.h, new py(ryVar2, note2, null, 1));
                            }
                            d2Var.L();
                            break;
                        } else {
                            d2Var.L();
                            break;
                        }
                        break;
                    case 1:
                        Note note5 = d2Var.r0;
                        if (note5 != null) {
                            ry ryVar3 = (ry) d2Var.p0.a();
                            ryVar3.getClass();
                            tb E3 = kr.E(ryVar3);
                            og ogVar3 = zh.a;
                            mz.z(E3, eg.h, new py(ryVar3, note5, null, 0));
                        }
                        d2Var.L();
                        break;
                    default:
                        d2Var.u0 = !d2Var.u0;
                        p8 p8Var17 = d2Var.o0;
                        p8Var17.getClass();
                        p8Var17.b.setIconResource(d2Var.u0 ? R.drawable.ic_pin_filled : R.drawable.ic_pin_outline);
                        break;
                }
            }
        });
        p8 p8Var16 = this.o0;
        p8Var16.getClass();
        p8Var16.a.setOnClickListener(new View.OnClickListener(this) { // from class: z1
            public final /* synthetic */ d2 g;

            {
                this.g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Note note2;
                String obj2;
                String obj3;
                int i8 = i;
                d2 d2Var = this.g;
                switch (i8) {
                    case 0:
                        p8 p8Var152 = d2Var.o0;
                        p8Var152.getClass();
                        Editable text = p8Var152.l.getText();
                        String obj4 = (text == null || (obj3 = text.toString()) == null) ? null : f70.g0(obj3).toString();
                        String str = obj4 == null ? "" : obj4;
                        p8 p8Var162 = d2Var.o0;
                        p8Var162.getClass();
                        Editable text2 = p8Var162.k.getText();
                        String obj5 = (text2 == null || (obj2 = text2.toString()) == null) ? null : f70.g0(obj2).toString();
                        String str2 = obj5 == null ? "" : obj5;
                        if (str.length() != 0 || str2.length() != 0) {
                            Note note3 = d2Var.r0;
                            if (note3 == null || (note2 = Note.copy$default(note3, 0, str, str2, d2Var.s0, d2Var.t0, d2Var.u0, 0L, System.currentTimeMillis(), 65, null)) == null) {
                                note2 = new Note(0, str, str2, d2Var.s0, d2Var.t0, d2Var.u0, 0L, 0L, 193, null);
                            }
                            Note note4 = d2Var.r0;
                            a80 a80Var = d2Var.p0;
                            if (note4 != null) {
                                ry ryVar = (ry) a80Var.a();
                                ryVar.getClass();
                                tb E = kr.E(ryVar);
                                og ogVar = zh.a;
                                mz.z(E, eg.h, new py(ryVar, note2, null, 2));
                            } else {
                                ry ryVar2 = (ry) a80Var.a();
                                ryVar2.getClass();
                                tb E2 = kr.E(ryVar2);
                                og ogVar2 = zh.a;
                                mz.z(E2, eg.h, new py(ryVar2, note2, null, 1));
                            }
                            d2Var.L();
                            break;
                        } else {
                            d2Var.L();
                            break;
                        }
                        break;
                    case 1:
                        Note note5 = d2Var.r0;
                        if (note5 != null) {
                            ry ryVar3 = (ry) d2Var.p0.a();
                            ryVar3.getClass();
                            tb E3 = kr.E(ryVar3);
                            og ogVar3 = zh.a;
                            mz.z(E3, eg.h, new py(ryVar3, note5, null, 0));
                        }
                        d2Var.L();
                        break;
                    default:
                        d2Var.u0 = !d2Var.u0;
                        p8 p8Var17 = d2Var.o0;
                        p8Var17.getClass();
                        p8Var17.b.setIconResource(d2Var.u0 ? R.drawable.ic_pin_filled : R.drawable.ic_pin_outline);
                        break;
                }
            }
        });
    }

    public final void M(List list, int i) {
        int i2 = (int) ((3.0f * E().getResources().getDisplayMetrics().density) + 0.5f);
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                xb.j0();
                throw null;
            }
            ((MaterialCardView) obj).setStrokeWidth(i3 == i ? i2 : 0);
            i3 = i4;
        }
    }

    @Override // defpackage.pm
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_add_edit_note, viewGroup, false);
        int i = R.id.btnDelete;
        MaterialButton materialButton = (MaterialButton) la0.t(inflate, R.id.btnDelete);
        if (materialButton != null) {
            i = R.id.btnPin;
            MaterialButton materialButton2 = (MaterialButton) la0.t(inflate, R.id.btnPin);
            if (materialButton2 != null) {
                i = R.id.btnSave;
                MaterialButton materialButton3 = (MaterialButton) la0.t(inflate, R.id.btnSave);
                if (materialButton3 != null) {
                    i = R.id.cgCategory;
                    ChipGroup chipGroup = (ChipGroup) la0.t(inflate, R.id.cgCategory);
                    if (chipGroup != null) {
                        i = R.id.chipIdeas;
                        if (((Chip) la0.t(inflate, R.id.chipIdeas)) != null) {
                            i = R.id.chipOther;
                            if (((Chip) la0.t(inflate, R.id.chipOther)) != null) {
                                i = R.id.chipPersonal;
                                if (((Chip) la0.t(inflate, R.id.chipPersonal)) != null) {
                                    i = R.id.chipStudy;
                                    if (((Chip) la0.t(inflate, R.id.chipStudy)) != null) {
                                        i = R.id.chipWork;
                                        if (((Chip) la0.t(inflate, R.id.chipWork)) != null) {
                                            i = R.id.colorCoral;
                                            MaterialCardView materialCardView = (MaterialCardView) la0.t(inflate, R.id.colorCoral);
                                            if (materialCardView != null) {
                                                i = R.id.colorDefault;
                                                MaterialCardView materialCardView2 = (MaterialCardView) la0.t(inflate, R.id.colorDefault);
                                                if (materialCardView2 != null) {
                                                    i = R.id.colorHoney;
                                                    MaterialCardView materialCardView3 = (MaterialCardView) la0.t(inflate, R.id.colorHoney);
                                                    if (materialCardView3 != null) {
                                                        i = R.id.colorLavender;
                                                        MaterialCardView materialCardView4 = (MaterialCardView) la0.t(inflate, R.id.colorLavender);
                                                        if (materialCardView4 != null) {
                                                            i = R.id.colorMint;
                                                            MaterialCardView materialCardView5 = (MaterialCardView) la0.t(inflate, R.id.colorMint);
                                                            if (materialCardView5 != null) {
                                                                i = R.id.colorSky;
                                                                MaterialCardView materialCardView6 = (MaterialCardView) la0.t(inflate, R.id.colorSky);
                                                                if (materialCardView6 != null) {
                                                                    i = R.id.etContent;
                                                                    TextInputEditText textInputEditText = (TextInputEditText) la0.t(inflate, R.id.etContent);
                                                                    if (textInputEditText != null) {
                                                                        i = R.id.etTitle;
                                                                        TextInputEditText textInputEditText2 = (TextInputEditText) la0.t(inflate, R.id.etTitle);
                                                                        if (textInputEditText2 != null) {
                                                                            i = R.id.tilContent;
                                                                            if (((TextInputLayout) la0.t(inflate, R.id.tilContent)) != null) {
                                                                                i = R.id.tilTitle;
                                                                                if (((TextInputLayout) la0.t(inflate, R.id.tilTitle)) != null) {
                                                                                    i = R.id.tvSheetTitle;
                                                                                    TextView textView = (TextView) la0.t(inflate, R.id.tvSheetTitle);
                                                                                    if (textView != null) {
                                                                                        NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                                                                        this.o0 = new p8(nestedScrollView, materialButton, materialButton2, materialButton3, chipGroup, materialCardView, materialCardView2, materialCardView3, materialCardView4, materialCardView5, materialCardView6, textInputEditText, textInputEditText2, textView);
                                                                                        nestedScrollView.getClass();
                                                                                        return nestedScrollView;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    @Override // defpackage.ph, defpackage.pm
    public final void u() {
        super.u();
        this.o0 = null;
    }
}
