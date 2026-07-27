package com.onesignal.core.internal.operations;

import java.util.List;
import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public interface IOperationExecutor {
    Object execute(List<? extends Operation> list, InterfaceC1218d interfaceC1218d);

    List<String> getOperations();
}
