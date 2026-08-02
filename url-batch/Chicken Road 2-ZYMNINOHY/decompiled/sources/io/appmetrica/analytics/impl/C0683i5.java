package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.i5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0683i5 implements ModuleAdRevenueProcessor, ModuleAdRevenueProcessorsHolder {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12018a = new ArrayList();

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final String getDescription() {
        return d3.i.g0(this.f12018a, null, "Composite processor with " + this.f12018a.size() + " children: [", "]", C0657h5.f11971a, 25);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        Object obj;
        boolean process;
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Processing Ad Revenue for " + Arrays.toString(objArr), new Object[0]);
        ArrayList arrayList = this.f12018a;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            ModuleAdRevenueProcessor moduleAdRevenueProcessor = (ModuleAdRevenueProcessor) obj;
            try {
                process = moduleAdRevenueProcessor.process(Arrays.copyOf(objArr, objArr.length));
                if (!process) {
                    LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue was not processed by " + moduleAdRevenueProcessor.getDescription(), new Object[0]);
                }
            } catch (Throwable th) {
                LoggerStorage.getMainPublicOrAnonymousLogger().error(th, "Got exception from processor " + moduleAdRevenueProcessor.getDescription(), new Object[0]);
            }
            if (process) {
                break;
            }
        }
        boolean z = ((ModuleAdRevenueProcessor) obj) != null;
        if (!z) {
            LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue was not processed by " + getDescription() + " since processor for " + Arrays.toString(objArr) + " was not found", new Object[0]);
        }
        return z;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder
    public final void register(ModuleAdRevenueProcessor moduleAdRevenueProcessor) {
        this.f12018a.add(moduleAdRevenueProcessor);
    }
}
