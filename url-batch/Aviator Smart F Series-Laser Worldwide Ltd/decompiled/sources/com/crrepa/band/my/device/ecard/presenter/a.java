package com.crrepa.band.my.device.ecard.presenter;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.ecard.model.BandECardCountEvent;
import com.crrepa.band.my.model.db.ECard;
import com.crrepa.band.my.model.db.ECardConfig;
import com.crrepa.band.my.model.db.proxy.ECardConfigDaoProxy;
import com.crrepa.band.my.model.db.proxy.ECardDaoProxy;
import com.crrepa.ble.conn.bean.CRPElectronicCardInfo;
import com.crrepa.ble.conn.callback.CRPElectronicCardCallback;
import com.moyoung.dafit.module.common.baseui.f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class a implements f {
    private int maxECardCount;
    private f1.a view;
    private ECardDaoProxy eCardDaoProxy = new ECardDaoProxy();
    private List<Integer> savedIdList = new ArrayList();
    private c eCardCallback = new c(this);
    private int savedECardIndex = 0;

    /* renamed from: com.crrepa.band.my.device.ecard.presenter.a$a, reason: collision with other inner class name */
    class C0178a implements Consumer {
        C0178a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Boolean bool) {
            a.this.view.renderECardListVisable(bool.booleanValue());
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(ECard eCard) {
            a.this.view.renderNewECard(eCard);
        }
    }

    private static class c implements CRPElectronicCardCallback {
        private WeakReference<a> weakReference;

        public c(a aVar) {
            this.weakReference = new WeakReference<>(aVar);
        }

        @Override // com.crrepa.ble.conn.callback.CRPElectronicCardCallback
        public void onElectronicCard(CRPElectronicCardInfo cRPElectronicCardInfo) {
            a aVar = this.weakReference.get();
            if (aVar == null || aVar.view == null) {
                return;
            }
            if (cRPElectronicCardInfo != null && !TextUtils.isEmpty(cRPElectronicCardInfo.getTitle()) && !TextUtils.isEmpty(cRPElectronicCardInfo.getUrl())) {
                com.orhanobut.logger.f.d("onElectronicCard: " + cRPElectronicCardInfo.toString());
                ECard eCard = new ECard();
                eCard.setId(Long.valueOf((long) cRPElectronicCardInfo.getId()));
                eCard.setTitle(cRPElectronicCardInfo.getTitle());
                eCard.setUrl(cRPElectronicCardInfo.getUrl());
                eCard.setIndex(Integer.valueOf(aVar.savedECardIndex));
                aVar.eCardDaoProxy.insert(eCard);
                a.access$108(aVar);
                aVar.showNewECard(eCard);
            }
            aVar.queryECard();
        }
    }

    public a() {
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    static /* synthetic */ int access$108(a aVar) {
        int i8 = aVar.savedECardIndex;
        aVar.savedECardIndex = i8 + 1;
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void queryECard() {
        List<Integer> list = this.savedIdList;
        if (list != null && !list.isEmpty()) {
            i4.getInstance().queryECard(this.savedIdList.remove(0).intValue(), this.eCardCallback);
            return;
        }
        List<ECard> all = this.eCardDaoProxy.getAll();
        if (all == null || all.isEmpty()) {
            Observable.just(Boolean.FALSE).observeOn(AndroidSchedulers.mainThread()).subscribe(new C0178a());
        }
    }

    private List<Integer> removeDuplication(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            Integer num = list.get(i8);
            if (!arrayList.contains(num)) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void showNewECard(ECard eCard) {
        Observable.just(eCard).observeOn(AndroidSchedulers.mainThread()).subscribe(new b());
    }

    public void delete(int i8, long j8) {
        boolean deleteECard = i4.getInstance().deleteECard((int) j8);
        if (deleteECard) {
            this.eCardDaoProxy.delete(j8);
        }
        this.view.renderDeleteECard(i8, deleteECard);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    public void getECardList(boolean z7) {
        ECardConfig eCardConfig = new ECardConfigDaoProxy().get(com.crrepa.band.my.ble.band.utils.a.getInstance().getName());
        if (eCardConfig == null) {
            this.view.renderECardListVisable(false);
            return;
        }
        this.maxECardCount = eCardConfig.getCount().intValue();
        if (z7 || !i4.getInstance().queryECardCount()) {
            this.view.renderECardList(this.eCardDaoProxy.getAll(), this.maxECardCount);
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandECardCoundEvent(BandECardCountEvent bandECardCountEvent) {
        List<Integer> removeDuplication = removeDuplication(bandECardCountEvent.getSavedIdList());
        this.savedIdList = removeDuplication;
        if (removeDuplication == null || removeDuplication.isEmpty()) {
            this.view.renderECardListVisable(false);
            return;
        }
        this.view.renderAddECardVisable(this.savedIdList.size() < this.maxECardCount);
        this.savedECardIndex = 0;
        this.eCardDaoProxy.deleteAll();
        queryECard();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void sendECardList(List<ECard> list) {
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < list.size(); i8++) {
                ECard eCard = list.get(i8);
                eCard.setIndex(Integer.valueOf(i8));
                arrayList.add(Integer.valueOf(eCard.getId().intValue()));
            }
            i4.getInstance().sendECardList(arrayList);
            this.eCardDaoProxy.deleteAll();
            this.eCardDaoProxy.insert(list);
        }
    }

    public void setView(f1.a aVar) {
        this.view = aVar;
    }
}
