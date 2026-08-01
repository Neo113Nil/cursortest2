package a4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.gdmhkmf.belbet.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import l.j2;
import l.o2;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f175a;

    /* renamed from: b, reason: collision with root package name */
    public Object f176b;

    /* renamed from: c, reason: collision with root package name */
    public Object f177c;
    public Object d;

    /* renamed from: e, reason: collision with root package name */
    public Object f178e;

    /* renamed from: f, reason: collision with root package name */
    public Object f179f;

    public h(g.i iVar, o1.h hVar, h3.l lVar) {
        this.f175a = iVar;
        this.f176b = hVar;
        this.f177c = lVar;
        View inflate = LayoutInflater.from(iVar).inflate(R.layout.dialog_add_birthday, (ViewGroup) null, false);
        int i = R.id.btnCancel;
        MaterialButton materialButton = (MaterialButton) b4.d.v(inflate, R.id.btnCancel);
        if (materialButton != null) {
            i = R.id.btnSave;
            MaterialButton materialButton2 = (MaterialButton) b4.d.v(inflate, R.id.btnSave);
            if (materialButton2 != null) {
                i = R.id.etDate;
                TextInputEditText textInputEditText = (TextInputEditText) b4.d.v(inflate, R.id.etDate);
                if (textInputEditText != null) {
                    i = R.id.etName;
                    TextInputEditText textInputEditText2 = (TextInputEditText) b4.d.v(inflate, R.id.etName);
                    if (textInputEditText2 != null) {
                        i = R.id.etNote;
                        TextInputEditText textInputEditText3 = (TextInputEditText) b4.d.v(inflate, R.id.etNote);
                        if (textInputEditText3 != null) {
                            i = R.id.tilDate;
                            TextInputLayout textInputLayout = (TextInputLayout) b4.d.v(inflate, R.id.tilDate);
                            if (textInputLayout != null) {
                                i = R.id.tilName;
                                TextInputLayout textInputLayout2 = (TextInputLayout) b4.d.v(inflate, R.id.tilName);
                                if (textInputLayout2 != null) {
                                    i = R.id.tilNote;
                                    if (((TextInputLayout) b4.d.v(inflate, R.id.tilNote)) != null) {
                                        i = R.id.tvDialogTitle;
                                        TextView textView = (TextView) b4.d.v(inflate, R.id.tvDialogTitle);
                                        if (textView != null) {
                                            i = R.id.tvZodiacPreview;
                                            TextView textView2 = (TextView) b4.d.v(inflate, R.id.tvZodiacPreview);
                                            if (textView2 != null) {
                                                this.d = new p1.c((LinearLayout) inflate, materialButton, materialButton2, textInputEditText, textInputEditText2, textInputEditText3, textInputLayout, textInputLayout2, textView, textView2);
                                                this.f178e = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("ru"));
                                                this.f179f = hVar != null ? hVar.f2900c : null;
                                                return;
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

    public static boolean b(int[] iArr, int i) {
        for (int i4 : iArr) {
            if (i4 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList c(Context context, int i) {
        int c5 = o2.c(context, R.attr.colorControlHighlight);
        int b2 = o2.b(context, R.attr.colorButtonNormal);
        int[] iArr = o2.f2523b;
        int[] iArr2 = o2.d;
        int b5 = f0.a.b(c5, i);
        return new ColorStateList(new int[][]{iArr, iArr2, o2.f2524c, o2.f2526f}, new int[]{b2, b5, f0.a.b(c5, i), i});
    }

    public static LayerDrawable d(j2 j2Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c5 = j2Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable c6 = j2Var.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c5 instanceof BitmapDrawable) && c5.getIntrinsicWidth() == dimensionPixelSize && c5.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c5;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c5.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c5.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c6 instanceof BitmapDrawable) && c6.getIntrinsicWidth() == dimensionPixelSize && c6.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c6;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c6.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c6.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void f(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = l.r.f2548b;
        }
        mutate.setColorFilter(l.r.c(i, mode));
    }

    public void a(LocalDate localDate) {
        this.f179f = localDate;
        p1.c cVar = (p1.c) this.d;
        cVar.d.setText(localDate.format((DateTimeFormatter) this.f178e));
        cVar.f3071g.setError(null);
        g.i iVar = (g.i) this.f175a;
        ZoneId zoneId = o1.d.f2892a;
        String string = iVar.getString(o1.d.h(localDate));
        i3.d.d(string, "getString(...)");
        String i = o1.d.i(localDate);
        TextView textView = cVar.f3072j;
        textView.setText(iVar.getString(R.string.zodiac_display, iVar.getString(R.string.zodiac_label), i, string));
        textView.setVisibility(0);
    }

    public ColorStateList e(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return c0.c.a(context, R.color.abc_tint_edittext);
        }
        if (i == 2131165291) {
            return c0.c.a(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return c(context, o2.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return c(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return c(context, o2.c(context, R.attr.colorAccent));
            }
            if (i == 2131165286 || i == R.drawable.abc_spinner_textfield_background_material) {
                return c0.c.a(context, R.color.abc_tint_spinner);
            }
            if (b((int[]) this.f176b, i)) {
                return o2.d(context, R.attr.colorControlNormal);
            }
            if (b((int[]) this.f178e, i)) {
                return c0.c.a(context, R.color.abc_tint_default);
            }
            if (b((int[]) this.f179f, i)) {
                return c0.c.a(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return c0.c.a(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d = o2.d(context, R.attr.colorSwitchThumbNormal);
        if (d == null || !d.isStateful()) {
            iArr[0] = o2.f2523b;
            iArr2[0] = o2.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = o2.f2525e;
            iArr2[1] = o2.c(context, R.attr.colorControlActivated);
            iArr[2] = o2.f2526f;
            iArr2[2] = o2.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = o2.f2523b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = o2.f2525e;
            iArr2[1] = o2.c(context, R.attr.colorControlActivated);
            iArr[2] = o2.f2526f;
            iArr2[2] = d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void g() {
        p1.c cVar = (p1.c) this.d;
        TextView textView = cVar.i;
        TextInputLayout textInputLayout = cVar.f3071g;
        o1.h hVar = (o1.h) this.f176b;
        textView.setText(hVar == null ? R.string.dialog_add_title : R.string.dialog_edit_title);
        if (hVar != null) {
            cVar.f3069e.setText(hVar.f2899b);
            a(hVar.f2900c);
            cVar.f3070f.setText(hVar.d);
        }
        final a.e0 e0Var = new a.e0(1, this);
        final int i = 0;
        cVar.d.setOnClickListener(new View.OnClickListener() { // from class: o1.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        e0Var.a();
                        break;
                    case 1:
                        e0Var.a();
                        break;
                    default:
                        e0Var.a();
                        break;
                }
            }
        });
        final int i4 = 1;
        textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: o1.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        e0Var.a();
                        break;
                    case 1:
                        e0Var.a();
                        break;
                    default:
                        e0Var.a();
                        break;
                }
            }
        });
        final int i5 = 2;
        textInputLayout.setOnClickListener(new View.OnClickListener() { // from class: o1.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        e0Var.a();
                        break;
                    case 1:
                        e0Var.a();
                        break;
                    default:
                        e0Var.a();
                        break;
                }
            }
        });
        c2.b bVar = new c2.b((g.i) this.f175a);
        ((g.b) bVar.f168b).f1479m = cVar.f3066a;
        g.f b2 = bVar.b();
        cVar.f3067b.setOnClickListener(new o1.e(0, b2));
        cVar.f3068c.setOnClickListener(new o1.a(this, b2, 2));
        b2.show();
    }

    public h() {
        this.f175a = new int[]{2131165301, 2131165299, 2131165225};
        this.f176b = new int[]{2131165249, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f177c = new int[]{2131165298, 2131165300, 2131165242, R.drawable.abc_text_cursor_material, 2131165295, 2131165296, 2131165297};
        this.d = new int[]{2131165274, R.drawable.abc_cab_background_internal_bg, 2131165273};
        this.f178e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f179f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public h(w3.c cVar) {
        i3.d.e(cVar, "taskRunner");
        this.f175a = cVar;
        this.f179f = j.f180a;
    }
}
