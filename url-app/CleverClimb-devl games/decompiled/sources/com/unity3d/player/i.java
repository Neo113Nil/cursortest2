package com.unity3d.player;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tapjoy.TapjoyConstants;

/* loaded from: classes2.dex */
public final class i extends Dialog implements TextWatcher, View.OnClickListener {

    /* renamed from: c, reason: collision with root package name */
    private static int f9364c = 1627389952;

    /* renamed from: d, reason: collision with root package name */
    private static int f9365d = -1;
    private static int e = 134217728;
    private static int f = 67108864;

    /* renamed from: a, reason: collision with root package name */
    private Context f9366a;

    /* renamed from: b, reason: collision with root package name */
    private UnityPlayer f9367b;

    public i(Context context, UnityPlayer unityPlayer, String str, int i, boolean z, boolean z2, boolean z3, String str2) {
        super(context);
        this.f9366a = null;
        this.f9367b = null;
        this.f9366a = context;
        this.f9367b = unityPlayer;
        getWindow().setGravity(80);
        getWindow().requestFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setContentView(createSoftInputView());
        getWindow().setLayout(-1, -2);
        getWindow().clearFlags(2);
        if (h.f9360a) {
            getWindow().clearFlags(e);
            getWindow().clearFlags(f);
        }
        EditText editText = (EditText) findViewById(1057292289);
        Button button = (Button) findViewById(1057292290);
        a(editText, str, i, z, z2, z3, str2);
        button.setOnClickListener(this);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.unity3d.player.i.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z4) {
                if (z4) {
                    i.this.getWindow().setSoftInputMode(5);
                }
            }
        });
    }

    private static int a(int i, boolean z, boolean z2, boolean z3) {
        int i2 = (z ? 32768 : 524288) | (z2 ? 131072 : 0) | (z3 ? 128 : 0);
        if (i < 0 || i > 10) {
            return i2;
        }
        int[] iArr = {1, 16385, 12290, 17, 2, 3, 8289, 33, 1, 16417, 17};
        return (iArr[i] & 2) != 0 ? iArr[i] : iArr[i] | i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a() {
        EditText editText = (EditText) findViewById(1057292289);
        if (editText == null) {
            return null;
        }
        return editText.getText().toString().trim();
    }

    private void a(EditText editText, String str, int i, boolean z, boolean z2, boolean z3, String str2) {
        editText.setImeOptions(6);
        editText.setText(str);
        editText.setHint(str2);
        editText.setHintTextColor(f9364c);
        editText.setInputType(a(i, z, z2, z3));
        editText.setImeOptions(33554432);
        editText.addTextChangedListener(this);
        editText.setClickable(true);
        if (z2) {
            return;
        }
        editText.selectAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z) {
        ((EditText) findViewById(1057292289)).setSelection(0, 0);
        this.f9367b.reportSoftInputStr(str, 1, z);
    }

    public final void a(String str) {
        EditText editText = (EditText) findViewById(1057292289);
        if (editText != null) {
            editText.setText(str);
            editText.setSelection(str.length());
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f9367b.reportSoftInputStr(editable.toString(), 0, false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    protected final View createSoftInputView() {
        RelativeLayout relativeLayout = new RelativeLayout(this.f9366a);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(f9365d);
        EditText editText = new EditText(this.f9366a) { // from class: com.unity3d.player.i.2
            @Override // android.widget.TextView, android.view.View
            public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
                if (i == 4) {
                    i.this.a(i.this.a(), true);
                    return true;
                }
                if (i == 84) {
                    return true;
                }
                return super.onKeyPreIme(i, keyEvent);
            }

            @Override // android.widget.TextView, android.view.View
            public final void onWindowFocusChanged(boolean z) {
                super.onWindowFocusChanged(z);
                if (z) {
                    ((InputMethodManager) i.this.f9366a.getSystemService("input_method")).showSoftInput(this, 0);
                }
            }
        };
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        layoutParams.addRule(0, 1057292290);
        editText.setLayoutParams(layoutParams);
        editText.setId(1057292289);
        relativeLayout.addView(editText);
        Button button = new Button(this.f9366a);
        button.setText(this.f9366a.getResources().getIdentifier("ok", "string", TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(11);
        button.setLayoutParams(layoutParams2);
        button.setId(1057292290);
        button.setBackgroundColor(0);
        relativeLayout.addView(button);
        ((EditText) relativeLayout.findViewById(1057292289)).setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.unity3d.player.i.3
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 6) {
                    i.this.a(i.this.a(), false);
                }
                return false;
            }
        });
        relativeLayout.setPadding(16, 16, 16, 16);
        return relativeLayout;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        a(a(), true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a(a(), false);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
