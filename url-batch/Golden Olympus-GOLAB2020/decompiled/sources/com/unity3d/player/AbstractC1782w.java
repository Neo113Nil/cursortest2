package com.unity3d.player;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* renamed from: com.unity3d.player.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1782w implements TextWatcher, h1.Q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22263a;

    /* renamed from: b, reason: collision with root package name */
    public final UnityPlayerForActivityOrService f22264b;

    /* renamed from: c, reason: collision with root package name */
    public final EditText f22265c = createEditText(this);

    /* renamed from: d, reason: collision with root package name */
    public boolean f22266d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22267e;

    /* renamed from: f, reason: collision with root package name */
    public M0 f22268f;

    /* renamed from: g, reason: collision with root package name */
    public C1773r0 f22269g;

    public AbstractC1782w(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.f22263a = context;
        this.f22264b = unityPlayerForActivityOrService;
    }

    public abstract /* synthetic */ void a();

    public void a(String str, int i4, boolean z4, boolean z5, boolean z6, boolean z7, String str2, int i5, boolean z8, boolean z9) {
        this.f22267e = z9;
        setupTextInput(str, i4, z4, z5, z6, z7, str2, i5);
        setHideInputField(z8);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f22264b.reportSoftInputStr(editable.toString(), 0, false);
        int selectionStart = this.f22265c.getSelectionStart();
        this.f22264b.reportSoftInputSelection(selectionStart, this.f22265c.getSelectionEnd() - selectionStart);
    }

    public final String b() {
        EditText editText = this.f22265c;
        if (editText == null) {
            return null;
        }
        return editText.getText().toString();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }

    public final void c() {
        ((InputMethodManager) this.f22263a.getSystemService(InputMethodManager.class)).showSoftInput(this.f22265c, 0);
    }

    public abstract EditText createEditText(AbstractC1782w abstractC1782w);

    public abstract /* synthetic */ void hide();

    public void invokeOnClose() {
        C1773r0 c1773r0 = this.f22269g;
        if (c1773r0 != null) {
            RunnableC1775s0 runnableC1775s0 = c1773r0.f22241a;
            runnableC1775s0.f22247a = true;
            if (runnableC1775s0.f22248b) {
                runnableC1775s0.f22249c.release();
            }
        }
    }

    public boolean isConsumeOutsideTouchesEnabled() {
        return this.f22267e;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }

    @Override // h1.Q
    public final void setCharacterLimit(int i4) {
        EditText editText = this.f22265c;
        if (editText != null) {
            if (i4 > 0) {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i4)});
            } else {
                editText.setFilters(new InputFilter[0]);
            }
        }
    }

    public abstract void setHideInputField(boolean z4);

    @Override // h1.Q
    public final void setSelection(int i4, int i5) {
        int i6;
        EditText editText = this.f22265c;
        if (editText == null || editText.getText().length() < (i6 = i5 + i4)) {
            return;
        }
        this.f22265c.setSelection(i4, i6);
    }

    @Override // h1.Q
    public final void setText(String str) {
        EditText editText = this.f22265c;
        if (editText != null) {
            editText.setText(str);
            this.f22265c.setSelection(str.length());
        }
    }

    public void setupTextInput(String str, int i4, boolean z4, boolean z5, boolean z6, boolean z7, String str2, int i5) {
        this.f22265c.setOnEditorActionListener(new C1780v(this));
        this.f22265c.setBackgroundColor(-1);
        this.f22265c.setImeOptions(6);
        this.f22265c.setText(str);
        this.f22265c.setHint(str2);
        this.f22265c.setHintTextColor(1627389952);
        EditText editText = this.f22265c;
        int i6 = (z4 ? 32768 : 524288) | (z5 ? 131072 : 0) | (z6 ? UserVerificationMethods.USER_VERIFY_PATTERN : 0);
        if (i4 >= 0 && i4 <= 11) {
            int i7 = new int[]{1, 16385, 12290, 17, 2, 3, 8289, 33, 1, 16417, 17, 8194}[i4];
            if ((i7 & 2) != 0) {
                i6 = (z6 ? 16 : 0) | i7;
            } else {
                i6 |= i7;
            }
        }
        editText.setInputType(i6);
        this.f22265c.setImeOptions(33554432);
        if (i5 > 0) {
            this.f22265c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i5)});
        }
        this.f22265c.addTextChangedListener(this);
        EditText editText2 = this.f22265c;
        editText2.setSelection(editText2.getText().length());
        this.f22265c.setClickable(true);
    }

    @Override // h1.Q
    public final void a(M0 m02) {
        this.f22268f = m02;
    }

    @Override // h1.Q
    public final void a(C1773r0 c1773r0) {
        this.f22269g = c1773r0;
    }

    public final void a(String str, boolean z4) {
        this.f22265c.setSelection(0, 0);
        this.f22264b.reportSoftInputStr(str, 1, z4);
    }
}
