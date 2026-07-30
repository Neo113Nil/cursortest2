package com.crrepa.band.my.device.contact.adapter;

import android.text.BidiFormatter;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.db.Contact;
import com.squareup.picasso.Picasso;
import java.io.File;

/* loaded from: classes2.dex */
public class QuickContactAdapter extends BaseQuickAdapter<Contact, BaseViewHolder> {
    private BidiFormatter bidiFormatter;

    public QuickContactAdapter() {
        super(R.layout.item_quick_contact);
        this.bidiFormatter = BidiFormatter.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, Contact contact) {
        String avatar = contact.getAvatar();
        String name = contact.getName();
        if (!TextUtils.isEmpty(avatar)) {
            File file = new File(avatar);
            Picasso.get().invalidate(file);
            Picasso.get().load(file).into((ImageView) baseViewHolder.getView(R.id.iv_contact_avatar));
        }
        baseViewHolder.setText(R.id.tv_contact_name, name);
        baseViewHolder.setText(R.id.tv_contact_number, this.bidiFormatter.unicodeWrap(contact.getNumber()));
    }
}
