package com.onesignal.common.consistency.models;

import com.onesignal.common.consistency.RywData;
import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public interface IConsistencyManager {
    Object getRywDataFromAwaitableCondition(ICondition iCondition, InterfaceC1218d interfaceC1218d);

    Object resolveConditionsWithID(String str, InterfaceC1218d interfaceC1218d);

    Object setRywData(String str, IConsistencyKeyEnum iConsistencyKeyEnum, RywData rywData, InterfaceC1218d interfaceC1218d);
}
