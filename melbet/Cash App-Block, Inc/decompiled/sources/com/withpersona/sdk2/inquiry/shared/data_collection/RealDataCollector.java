package com.withpersona.sdk2.inquiry.shared.data_collection;

import androidx.lifecycle.SavedStateHandle;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class RealDataCollector implements DataCollector {
    public final ArrayList collectedData;
    public final boolean isActive;
    public final SavedStateHandle savedStateHandle;

    public RealDataCollector(SavedStateHandle savedStateHandle) {
        savedStateHandle.getClass();
        this.savedStateHandle = savedStateHandle;
        ArrayList arrayList = (ArrayList) savedStateHandle.get("com.withpersona.sdk2.inquiry.shared.data_collection.RealDataCollector.collectedData");
        this.collectedData = arrayList == null ? new ArrayList() : arrayList;
        this.isActive = true;
    }

    @Override // com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector
    public final boolean isActive() {
        return this.isActive;
    }

    @Override // com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector
    public final void submit(StepData stepData) {
        ArrayList arrayList = this.collectedData;
        arrayList.add(stepData);
        this.savedStateHandle.set(arrayList, "com.withpersona.sdk2.inquiry.shared.data_collection.RealDataCollector.collectedData");
    }
}
