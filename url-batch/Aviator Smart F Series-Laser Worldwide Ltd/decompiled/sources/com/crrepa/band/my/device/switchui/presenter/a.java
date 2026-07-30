package com.crrepa.band.my.device.switchui.presenter;

import android.content.Context;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.BandFunctionModel;
import com.crrepa.band.my.model.db.BandFunction;
import com.crrepa.band.my.model.db.proxy.BandFunctionDaoProxy;
import com.crrepa.ble.conn.bean.CRPFunctionInfo;
import com.crrepa.ble.conn.callback.CRPDeviceFunctionCallback;
import com.moyoung.dafit.module.common.baseui.f;
import com.moyoung.dafit.module.common.utils.s;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class a implements f {
    private BandFunction bandFunction;
    private v1.a bandFunctionView;
    private String[] supportFunctionNameList;
    private BandFunctionDaoProxy bandFunctionDaoProxy = new BandFunctionDaoProxy();
    private b bandFunctionCallback = new b(this);

    /* renamed from: com.crrepa.band.my.device.switchui.presenter.a$a, reason: collision with other inner class name */
    class C0188a implements Consumer {
        C0188a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(List<BandFunctionModel> list) {
            a.this.bandFunctionView.renderFunctionList(list);
        }
    }

    static class b implements CRPDeviceFunctionCallback {
        private WeakReference<a> weakReference;

        public b(a aVar) {
            this.weakReference = new WeakReference<>(aVar);
        }

        @Override // com.crrepa.ble.conn.callback.CRPDeviceFunctionCallback
        public void onFunctionChenge(CRPFunctionInfo cRPFunctionInfo) {
            a aVar = this.weakReference.get();
            if (aVar == null) {
                return;
            }
            boolean isDisplayFunction = cRPFunctionInfo.isDisplayFunction();
            List<BandFunctionModel> convert = u1.a.convert(aVar.supportFunctionNameList, cRPFunctionInfo.getFunctionList(), isDisplayFunction);
            if (isDisplayFunction) {
                aVar.showDisplayFunction(convert);
            }
        }
    }

    public a(Context context) {
        getBandFunction(com.crrepa.band.my.ble.band.utils.a.getInstance().getName());
        this.supportFunctionNameList = context.getResources().getStringArray(R.array.function_array);
    }

    private void getBandFunction(String str) {
        BandFunction bandFunction = this.bandFunctionDaoProxy.get(str);
        this.bandFunction = bandFunction;
        if (bandFunction == null) {
            BandFunction bandFunction2 = new BandFunction();
            this.bandFunction = bandFunction2;
            bandFunction2.setName(str);
        }
    }

    private List<Integer> getDefaultFunctionList() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 1; i8 <= this.supportFunctionNameList.length; i8++) {
            arrayList.add(Integer.valueOf(i8));
        }
        return arrayList;
    }

    private void getLocalBandFunctionList() {
        List json2List = s.json2List(this.bandFunction.getFunctions(), Integer[].class);
        if (json2List != null) {
            showDisplayFunction(u1.a.convert(this.supportFunctionNameList, json2List, true));
        }
    }

    private List<Integer> getSupportFunctionList() {
        return s.json2List(this.bandFunction.getSupportFunctions(), Integer[].class);
    }

    private void saveBandFunctionList(List<Integer> list) {
        this.bandFunction.setFunctions(s.bean2Json(list));
        this.bandFunctionDaoProxy.save(this.bandFunction);
    }

    private boolean sendBandFunctionList(List<Integer> list) {
        CRPFunctionInfo cRPFunctionInfo = new CRPFunctionInfo();
        cRPFunctionInfo.setFunctionList(list);
        return i4.getInstance().sendBandFunction(cRPFunctionInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDisplayFunction(List<BandFunctionModel> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        com.orhanobut.logger.f.d("display function: " + list);
        for (BandFunctionModel bandFunctionModel : getAllFunctionList()) {
            int function = bandFunctionModel.getFunction();
            Iterator<BandFunctionModel> it = list.iterator();
            boolean z7 = false;
            while (it.hasNext()) {
                if (it.next().getFunction() == function) {
                    z7 = true;
                }
            }
            if (!z7) {
                arrayList.add(bandFunctionModel);
            }
        }
        Observable.just(arrayList).observeOn(AndroidSchedulers.mainThread()).subscribe(new C0188a());
    }

    public void addFunctionHeaderView() {
        for (int i8 = 0; i8 < 2; i8++) {
            this.bandFunctionView.addFunctionHeaaerView(this.supportFunctionNameList[i8], i8);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.bandFunctionView = null;
    }

    public List<BandFunctionModel> getAllFunctionList() {
        ArrayList arrayList = new ArrayList();
        List<Integer> supportFunctionList = getSupportFunctionList();
        if (supportFunctionList == null) {
            supportFunctionList = getDefaultFunctionList();
        }
        for (int i8 = 0; i8 < supportFunctionList.size(); i8++) {
            int intValue = supportFunctionList.get(i8).intValue();
            if (intValue > 2) {
                BandFunctionModel bandFunctionModel = new BandFunctionModel();
                bandFunctionModel.setEnable(false);
                bandFunctionModel.setIndex((byte) i8);
                bandFunctionModel.setFunction(intValue);
                String[] strArr = this.supportFunctionNameList;
                bandFunctionModel.setName(strArr[(intValue - 1) % strArr.length]);
                arrayList.add(bandFunctionModel);
            }
        }
        return arrayList;
    }

    public void getBandFunctionList() {
        if (i4.getInstance().queryBandDisplayFunction(this.bandFunctionCallback)) {
            return;
        }
        getLocalBandFunctionList();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void saveBandDisplayFunctionList(Context context, List<BandFunctionModel> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        for (BandFunctionModel bandFunctionModel : list) {
            if (bandFunctionModel.isEnable()) {
                arrayList.add(Integer.valueOf(bandFunctionModel.getFunction()));
            }
        }
        if (sendBandFunctionList(arrayList)) {
            saveBandFunctionList(arrayList);
        } else {
            this.bandFunctionView.saveFailed(context.getString(R.string.band_setting_send_fail));
        }
    }

    public void setView(v1.a aVar) {
        this.bandFunctionView = aVar;
    }
}
