package com.crrepa.band.my.health.ecg.alg;

import com.orhanobut.logger.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class a {
    protected static final int NOT_WEAR_BAND = 20000000;
    private InterfaceC0199a ecgChangeListener;
    protected ArrayList<Integer> inputList = new ArrayList<>();
    protected ArrayList<Integer> filterList = new ArrayList<>();

    /* renamed from: com.crrepa.band.my.health.ecg.alg.a$a, reason: collision with other inner class name */
    public interface InterfaceC0199a {
        void onEcgChange(List<Integer> list);

        void onEcgResult(c cVar);
    }

    public abstract void complete();

    public abstract void filter(List<Integer> list);

    public InterfaceC0199a getEcgChangeListener() {
        return this.ecgChangeListener;
    }

    public abstract int getRealTimeHeartRate();

    public abstract int getSignalType();

    public abstract void init();

    public abstract boolean isValidData(int i8);

    protected void onEcgChange(List list) {
        InterfaceC0199a ecgChangeListener = getEcgChangeListener();
        if (ecgChangeListener != null) {
            ecgChangeListener.onEcgChange(list);
        }
    }

    protected void onEcgResult(c cVar) {
        InterfaceC0199a ecgChangeListener = getEcgChangeListener();
        if (ecgChangeListener != null) {
            ecgChangeListener.onEcgResult(cVar);
        }
    }

    public void release() {
        f.d("release");
        this.inputList.clear();
        this.filterList.clear();
    }

    public void setEcgChangeListener(InterfaceC0199a interfaceC0199a) {
        this.ecgChangeListener = interfaceC0199a;
    }

    public void writeLog() {
    }
}
