package com.huawei.hms.adapter.sysobs;

import android.content.Intent;

/* loaded from: classes.dex */
public interface SystemNotifier {
    void notifyNoticeObservers(int i4);

    void notifyObservers(int i4);

    void notifyObservers(Intent intent, String str);

    void registerObserver(SystemObserver systemObserver);

    void unRegisterObserver(SystemObserver systemObserver);
}
