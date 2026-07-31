package com.appsflyer.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.internal.db.PurchaseDatabaseHelper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PurchaseProcessingManager.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0005H\u0007R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/appsflyer/internal/PurchaseProcessingManager;", "", "()V", "tokensUnderProcess", "", "", "kotlin.jvm.PlatformType", "", "addToken", "", PurchaseDatabaseHelper.COLUMN_NAME_TOKEN, "clearAll", "isTokenInProcessing", "", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class PurchaseProcessingManager {
    public static final PurchaseProcessingManager INSTANCE = new PurchaseProcessingManager();
    private static final Set<String> tokensUnderProcess = Collections.synchronizedSet(new HashSet());

    private PurchaseProcessingManager() {
    }

    @JvmStatic
    public static final synchronized void addToken(String token) {
        synchronized (PurchaseProcessingManager.class) {
            Intrinsics.checkNotNullParameter(token, "token");
            tokensUnderProcess.add(token);
        }
    }

    @JvmStatic
    public static final synchronized boolean isTokenInProcessing(String token) {
        boolean contains;
        synchronized (PurchaseProcessingManager.class) {
            Intrinsics.checkNotNullParameter(token, "token");
            contains = tokensUnderProcess.contains(token);
        }
        return contains;
    }

    @JvmStatic
    public static final synchronized void clearAll() {
        synchronized (PurchaseProcessingManager.class) {
            tokensUnderProcess.clear();
        }
    }
}
