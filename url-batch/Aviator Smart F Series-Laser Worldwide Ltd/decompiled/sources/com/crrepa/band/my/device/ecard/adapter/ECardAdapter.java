package com.crrepa.band.my.device.ecard.adapter;

import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.db.ECard;
import com.orhanobut.logger.f;

/* loaded from: classes2.dex */
public class ECardAdapter extends BaseQuickAdapter<ECard, BaseViewHolder> {

    class a implements Runnable {
        final /* synthetic */ ECard val$item;
        final /* synthetic */ ImageView val$ivQrCode;

        a(ImageView imageView, ECard eCard) {
            this.val$ivQrCode = imageView;
            this.val$item = eCard;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.val$ivQrCode.setImageBitmap(b5.a.createQRCode(this.val$item.getUrl(), this.val$ivQrCode.getHeight()));
        }
    }

    public ECardAdapter() {
        super(R.layout.item_ecard_list);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(@NonNull ECard eCard) {
        f.d("addData: " + eCard.toString());
        for (int i8 = 0; i8 < getData().size(); i8++) {
            if (getData().get(i8).getId().intValue() == eCard.getId().intValue()) {
                setData(i8, eCard);
                return;
            }
        }
        super.addData((ECardAdapter) eCard);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, ECard eCard) {
        baseViewHolder.setText(R.id.tv_ecard_title, eCard.getTitle());
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.iv_ecard_qrcode);
        imageView.post(new a(imageView, eCard));
    }
}
