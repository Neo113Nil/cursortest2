package com.bytedance.sdk.openadsdk.zn;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.Locale;

/* loaded from: classes12.dex */
public class klz extends Dialog {
    private com.bytedance.sdk.openadsdk.core.hhw.zg btk;
    private com.bytedance.sdk.openadsdk.core.hhw.zg fb;
    private zmn fs;
    private com.bytedance.sdk.openadsdk.core.hhw.fb hhw;
    private final iv nps;
    private com.bytedance.sdk.openadsdk.core.hhw.btk zmn;
    private com.bytedance.sdk.openadsdk.core.hhw.fs zn;

    public interface zmn {
        void fs();

        void zmn();

        void zmn(int i, FilterWord filterWord, String str);

        void zn();
    }

    public klz(@NonNull Context context, iv ivVar) {
        super(context, doe.hhw(context, "tt_quick_option_dialog"));
        setCanceledOnTouchOutside(false);
        this.nps = ivVar;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.core.hhw.btk zmn2 = zmn(kgc.zmn());
        this.zmn = zmn2;
        setContentView(zmn2);
        zmn(this.zmn);
        zn();
        zmn();
        fb();
    }

    private void zmn(View view) {
        zmn((EditText) this.zn);
        iv ivVar = this.nps;
        if (ivVar != null) {
            String nps = ivVar.nps();
            if (!TextUtils.isEmpty(nps)) {
                this.zn.setText(nps);
                this.fb.setText(String.format(Locale.getDefault(), "%d%s", Integer.valueOf(nps.length()), "/200"));
            }
            this.btk.setEnabled(!TextUtils.isEmpty(nps));
        }
        this.btk.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.zn.klz.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/zn/klz$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view2);
                safedk_klz$1_onClick_caaee631db5ecce7f6982507e9aa8595(view2);
            }

            public void safedk_klz$1_onClick_caaee631db5ecce7f6982507e9aa8595(View p0) {
                String obj = klz.this.zn.getText().toString();
                if (klz.this.fs != null) {
                    klz.this.fs.zmn(4, iv.zmn, obj);
                }
                klz.this.dismiss();
            }
        });
        this.hhw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.zn.klz.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/zn/klz$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view2);
                safedk_klz$2_onClick_7c02ab9a5e79caa15df766ac97de5d8d(view2);
            }

            public void safedk_klz$2_onClick_7c02ab9a5e79caa15df766ac97de5d8d(View p0) {
                if (klz.this.fs != null) {
                    klz.this.fs.fs();
                }
                klz.this.dismiss();
            }
        });
        this.zn.addTextChangedListener(new TextWatcher() { // from class: com.bytedance.sdk.openadsdk.zn.klz.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                com.bytedance.sdk.openadsdk.core.hhw.zg zgVar;
                int round = Math.round(charSequence.length());
                klz.this.fb.setText(round + "/200");
                boolean z = true;
                if (round > 0) {
                    if (klz.this.btk.isEnabled()) {
                        return;
                    } else {
                        zgVar = klz.this.btk;
                    }
                } else {
                    zgVar = klz.this.btk;
                    if (klz.this.nps == null || TextUtils.isEmpty(klz.this.nps.nps())) {
                        z = false;
                    }
                }
                zgVar.setEnabled(z);
            }
        });
    }

    public static void zmn(EditText editText) {
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: com.bytedance.sdk.openadsdk.zn.klz.4
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                while (i < i2) {
                    int type = Character.getType(charSequence.charAt(i));
                    if (type == 19 || type == 28) {
                        return "";
                    }
                    i++;
                }
                return null;
            }
        }, new InputFilter.LengthFilter(200)});
    }

    private void zn() {
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            if (window.getDecorView() != null) {
                window.getDecorView().setPadding(0, 0, 0, 0);
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
            window.setGravity(80);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        zmn zmnVar = this.fs;
        if (zmnVar != null) {
            zmnVar.zmn();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        fs();
        super.dismiss();
    }

    public void zmn(zmn zmnVar) {
        this.fs = zmnVar;
    }

    public void zmn() {
        com.bytedance.sdk.openadsdk.core.hhw.fs fsVar = this.zn;
        if (fsVar == null) {
            return;
        }
        fsVar.requestFocus();
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    public void fs() {
        InputMethodManager inputMethodManager;
        com.bytedance.sdk.openadsdk.core.hhw.fs fsVar = this.zn;
        if (fsVar == null || (inputMethodManager = (InputMethodManager) fsVar.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.zmn.getWindowToken(), 0);
    }

    private void fb() {
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.bytedance.sdk.openadsdk.zn.klz.5
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (klz.this.fs != null) {
                    klz.this.fs.zn();
                }
            }
        });
    }

    public void zmn(nqi nqiVar) {
        iv ivVar = this.nps;
        if (ivVar != null) {
            ivVar.zmn(nqiVar);
        }
    }

    private com.bytedance.sdk.openadsdk.core.hhw.btk zmn(Context context) {
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        btkVar.setOrientation(1);
        btkVar.setBackground(com.bytedance.sdk.openadsdk.utils.rc.zmn(context, "tt_dislike_dialog_bg"));
        com.bytedance.sdk.openadsdk.core.hhw.nps npsVar = new com.bytedance.sdk.openadsdk.core.hhw.nps(context);
        npsVar.setLayoutParams(new LinearLayout.LayoutParams(-1, jy.fs(context, 48.0f)));
        this.hhw = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        int fs = jy.fs(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(fs, fs);
        layoutParams.addRule(16);
        layoutParams.addRule(11);
        int fs2 = jy.fs(context, 10.0f);
        layoutParams.topMargin = fs2;
        layoutParams.rightMargin = fs2;
        this.hhw.setLayoutParams(layoutParams);
        this.hhw.setClickable(true);
        this.hhw.setFocusable(true);
        this.hhw.setImageDrawable(com.bytedance.sdk.openadsdk.utils.rc.zmn(context, "tt_titlebar_close_seletor"));
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(16);
        layoutParams2.topMargin = jy.fs(context, 12.0f);
        zgVar.setLayoutParams(layoutParams2);
        zgVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        zgVar.setGravity(17);
        zgVar.setSingleLine(true);
        zgVar.setText(doe.zmn(context, "tt_other_reason"));
        zgVar.setTextColor(Color.parseColor("#161823"));
        zgVar.setTextSize(15.0f);
        zgVar.setTypeface(Typeface.defaultFromStyle(0));
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, jy.fs(context, 0.5f)));
        view.setBackgroundColor(Color.argb(51, 22, 24, 35));
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar2 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        btkVar2.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.hhw.fs fsVar = new com.bytedance.sdk.openadsdk.core.hhw.fs(context);
        this.zn = fsVar;
        fsVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(200), new InputFilter.AllCaps()});
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = jy.fs(context, 16.0f);
        layoutParams3.rightMargin = jy.fs(context, 16.0f);
        layoutParams3.topMargin = jy.fs(context, 11.5f);
        this.zn.setLayoutParams(layoutParams3);
        this.zn.setLines(4);
        this.zn.setGravity(48);
        this.zn.setTextSize(15.0f);
        this.zn.setTextColor(Color.rgb(22, 24, 35));
        this.zn.setHintTextColor(Color.parseColor("#57161823"));
        this.zn.setBackground(null);
        this.zn.setImeOptions(268435456);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar3 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        int fs3 = jy.fs(context, 16.0f);
        int fs4 = jy.fs(context, 17.0f);
        btkVar3.setPadding(fs3, fs4, fs3, fs4);
        btkVar3.setLayoutParams(layoutParams4);
        btkVar3.setOrientation(0);
        this.fb = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.gravity = 8388611;
        this.fb.setLayoutParams(layoutParams5);
        this.fb.setText(String.format("0%s", "/200"));
        this.fb.setGravity(8388611);
        this.fb.setTextColor(Color.parseColor("#57161823"));
        this.fb.setTextSize(15.0f);
        this.btk = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 8388613;
        this.btk.setLayoutParams(layoutParams6);
        this.btk.setTextSize(14.0f);
        this.btk.setTextColor(-1);
        this.btk.setVisibility(0);
        this.btk.setSingleLine(true);
        int fs5 = jy.fs(context, 27.0f);
        int fs6 = jy.fs(context, 5.0f);
        this.btk.setPadding(fs5, fs6, fs5, fs6);
        int fs7 = jy.fs(context, 6.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f = fs7;
        gradientDrawable.setCornerRadius(f);
        int rgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(rgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(f);
        gradientDrawable2.setColor(rgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        this.btk.setBackground(stateListDrawable);
        this.btk.setText(doe.zmn(context, "tt_done"));
        this.btk.setEnabled(false);
        btkVar.addView(npsVar);
        btkVar.addView(view);
        btkVar.addView(btkVar2);
        npsVar.addView(this.hhw);
        npsVar.addView(zgVar);
        btkVar2.addView(this.zn);
        btkVar2.addView(btkVar3);
        btkVar3.addView(this.fb);
        btkVar3.addView(this.btk);
        return btkVar;
    }
}
