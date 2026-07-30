package com.crrepa.band.my.device.setting.quickresponse;

import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public class ResponseMessageAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    private static final int MAX_MESSAGE_BYTES_LENGTH = 80;

    class a implements TextWatcher {
        final /* synthetic */ EditText val$editText;
        final /* synthetic */ BaseViewHolder val$helper;
        final /* synthetic */ int val$itemPosition;

        a(int i8, BaseViewHolder baseViewHolder, EditText editText) {
            this.val$itemPosition = i8;
            this.val$helper = baseViewHolder;
            this.val$editText = editText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            com.orhanobut.logger.f.d("onTextChanged: " + ((Object) charSequence) + "-" + i8 + "-" + i9 + "-" + i10);
            ResponseMessageAdapter.this.getData().set(this.val$itemPosition, charSequence.toString());
            this.val$helper.setGone(R.id.iv_delete_response, !this.val$editText.hasFocus() || this.val$editText.getText().length() <= 0);
        }
    }

    private static class b implements InputFilter {
        private final int maxBytesLength;

        public b(int i8) {
            this.maxBytesLength = i8;
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i8, int i9, Spanned spanned, int i10, int i11) {
            int i12 = this.maxBytesLength;
            String obj = spanned.toString();
            Charset charset = StandardCharsets.UTF_8;
            int length = i12 - obj.getBytes(charset).length;
            if (i11 - i10 > 0) {
                length += spanned.subSequence(i10, i11).toString().getBytes(charset).length;
            }
            if (length <= 0) {
                return "";
            }
            if (length >= charSequence.subSequence(i8, i9).toString().getBytes(charset).length) {
                return null;
            }
            return ResponseMessageAdapter.filterMessage(charSequence.subSequence(i8, i9), length, charset);
        }
    }

    public ResponseMessageAdapter() {
        super(R.layout.item_response_content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CharSequence filterMessage(CharSequence charSequence, int i8, Charset charset) {
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        if (i8 < charSequence.length()) {
            charSequence = charSequence.subSequence(0, i8);
        }
        while (i8 < charSequence.toString().getBytes(charset).length) {
            charSequence = charSequence.subSequence(0, charSequence.length() - 1);
        }
        return charSequence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$convert$1(BaseViewHolder baseViewHolder, EditText editText, View view, boolean z7) {
        baseViewHolder.setGone(R.id.iv_delete_response, !z7 || editText.getText().length() <= 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(final BaseViewHolder baseViewHolder, String str) {
        final EditText editText = (EditText) baseViewHolder.getView(R.id.et_response_content);
        ((ImageView) baseViewHolder.getView(R.id.iv_delete_response)).setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.setting.quickresponse.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                editText.setText("");
            }
        });
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.crrepa.band.my.device.setting.quickresponse.j
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z7) {
                ResponseMessageAdapter.lambda$convert$1(BaseViewHolder.this, editText, view, z7);
            }
        });
        baseViewHolder.setText(R.id.et_response_content, str);
        editText.setFilters(new b[]{new b(80)});
        editText.addTextChangedListener(new a(getItemPosition(str), baseViewHolder, editText));
        baseViewHolder.setGone(R.id.line_response, getData().size() - 1 <= getItemPosition(str));
    }
}
