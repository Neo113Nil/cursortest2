package com.bytedance.sdk.openadsdk.dislike;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
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
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.customview.PAGEditText;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.so;
import java.util.ArrayList;

/* compiled from: TTDislikeSuggestionDialog.java */
/* loaded from: classes2.dex */
public class NB extends Dialog {
    private PAGTextView Jd;
    private String Mxy;
    private PAGTextView NB;
    private pvs icD;
    private PAGLinearLayout pvs;
    private PAGImageView sUS;
    private String so;
    private PAGEditText vG;
    private String yiw;

    /* compiled from: TTDislikeSuggestionDialog.java */
    public interface pvs {
        void icD();

        void pvs();

        void pvs(int i, FilterWord filterWord);

        void vG();
    }

    public NB(Context context) {
        super(context, uc.sUS(context, "tt_quick_option_dialog"));
        setCanceledOnTouchOutside(false);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PAGLinearLayout pvs2 = pvs(mnm.pvs());
        this.pvs = pvs2;
        setContentView(pvs2);
        pvs(this.pvs);
        vG();
        pvs();
        Jd();
    }

    private void pvs(View view) {
        pvs((EditText) this.vG);
        this.NB.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.NB.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                String obj = NB.this.vG.getText().toString();
                if (obj.length() <= 0 || obj.isEmpty()) {
                    return;
                }
                FilterWord filterWord = new FilterWord("0:00", obj);
                ArrayList arrayList = new ArrayList();
                arrayList.add(filterWord);
                com.bytedance.sdk.openadsdk.dislike.pvs.pvs().pvs(NB.this.yiw, arrayList, NB.this.so, obj, NB.this.Mxy);
                if (NB.this.icD != null) {
                    NB.this.icD.pvs(4, filterWord);
                }
                NB.this.dismiss();
            }
        });
        this.sUS.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.NB.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (NB.this.icD != null) {
                    NB.this.icD.icD();
                }
                NB.this.dismiss();
            }
        });
        this.vG.addTextChangedListener(new TextWatcher() { // from class: com.bytedance.sdk.openadsdk.dislike.NB.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int round = Math.round(charSequence.length());
                NB.this.Jd.setText(String.valueOf(round));
                if (round > 0) {
                    NB.this.NB.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    NB.this.NB.setClickable(true);
                } else {
                    NB.this.NB.setTextColor(-7829368);
                    NB.this.NB.setClickable(false);
                }
            }
        });
    }

    public static void pvs(EditText editText) {
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: com.bytedance.sdk.openadsdk.dislike.NB.4
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
        }, new InputFilter.LengthFilter(500)});
    }

    private void vG() {
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
        pvs pvsVar = this.icD;
        if (pvsVar != null) {
            pvsVar.pvs();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        icD();
        super.dismiss();
    }

    public void pvs(pvs pvsVar) {
        this.icD = pvsVar;
    }

    public void pvs() {
        PAGEditText pAGEditText = this.vG;
        if (pAGEditText == null) {
            return;
        }
        pAGEditText.requestFocus();
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    public void icD() {
        InputMethodManager inputMethodManager;
        PAGEditText pAGEditText = this.vG;
        if (pAGEditText == null || (inputMethodManager = (InputMethodManager) pAGEditText.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.pvs.getWindowToken(), 0);
    }

    private void Jd() {
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.bytedance.sdk.openadsdk.dislike.NB.5
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (NB.this.icD != null) {
                    NB.this.icD.vG();
                }
            }
        });
    }

    public void pvs(String str, String str2) {
        this.yiw = str;
        this.so = str2;
    }

    public void pvs(String str) {
        this.Mxy = str;
    }

    private PAGLinearLayout pvs(Context context) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setBackground(so.pvs(context, "tt_dislike_dialog_bg"));
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, Pj.icD(context, 48.0f)));
        this.sUS = new PAGImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(16);
        layoutParams.topMargin = Pj.icD(context, 12.0f);
        layoutParams.leftMargin = Pj.icD(context, 12.0f);
        this.sUS.setLayoutParams(layoutParams);
        this.sUS.setClickable(true);
        this.sUS.setFocusable(true);
        this.sUS.setImageDrawable(so.pvs(context, "tt_titlebar_close_seletor"));
        PAGTextView pAGTextView = new PAGTextView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(16);
        layoutParams2.topMargin = Pj.icD(context, 12.0f);
        pAGTextView.setLayoutParams(layoutParams2);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        pAGTextView.setGravity(17);
        pAGTextView.setSingleLine(true);
        pAGTextView.setText(uc.pvs(context, "tt_display_error"));
        pAGTextView.setTextColor(Color.parseColor("#161823"));
        pAGTextView.setTextSize(15.0f);
        pAGTextView.setTypeface(Typeface.defaultFromStyle(0));
        this.NB = new PAGTextView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(16);
        layoutParams3.topMargin = Pj.icD(context, 12.0f);
        layoutParams3.leftMargin = Pj.icD(context, 5.0f);
        layoutParams3.rightMargin = Pj.icD(context, 12.0f);
        this.NB.setLayoutParams(layoutParams3);
        this.NB.setPadding(0, 0, Pj.icD(context, 12.0f), 0);
        this.NB.setTextSize(14.0f);
        this.NB.setTextColor(-7829368);
        this.NB.setClickable(false);
        this.NB.setVisibility(0);
        this.NB.setGravity(5);
        this.NB.setSingleLine(true);
        this.NB.setText(uc.pvs(context, "tt_suggestion_commit"));
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, Pj.icD(context, 0.5f)));
        view.setBackgroundColor(Color.parseColor("#0F161823"));
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        pAGLinearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        pAGLinearLayout2.setOrientation(0);
        this.vG = new PAGEditText(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 15.0f;
        layoutParams4.leftMargin = Pj.icD(context, 12.0f);
        layoutParams4.topMargin = Pj.icD(context, 11.5f);
        this.vG.setLayoutParams(layoutParams4);
        this.vG.setLines(7);
        this.vG.setHint(uc.pvs(context, "tt_suggestion_description"));
        this.vG.setGravity(3);
        this.vG.setTextSize(15.0f);
        this.vG.setTextColor(Color.parseColor("#161823"));
        this.vG.setHintTextColor(Color.parseColor("#57161823"));
        this.vG.setBackground(null);
        this.vG.setImeOptions(268435456);
        this.Jd = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.rightMargin = Pj.icD(context, 12.0f);
        layoutParams5.bottomMargin = Pj.icD(context, 6.0f);
        layoutParams5.gravity = 80;
        this.Jd.setLayoutParams(layoutParams5);
        this.Jd.setText("0");
        this.Jd.setGravity(5);
        this.Jd.setTextColor(Color.parseColor("#BF161823"));
        this.Jd.setHintTextColor(Color.parseColor("#57161823"));
        this.Jd.setTextSize(12.0f);
        pAGLinearLayout.addView(pAGRelativeLayout);
        pAGLinearLayout.addView(view);
        pAGLinearLayout.addView(pAGLinearLayout2);
        pAGRelativeLayout.addView(this.sUS);
        pAGRelativeLayout.addView(pAGTextView);
        pAGRelativeLayout.addView(this.NB);
        pAGLinearLayout2.addView(this.vG);
        pAGLinearLayout2.addView(this.Jd);
        return pAGLinearLayout;
    }
}
