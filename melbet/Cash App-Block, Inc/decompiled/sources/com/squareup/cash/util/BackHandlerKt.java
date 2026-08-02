package com.squareup.cash.util;

import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.core.view.insets.SystemBarStateMonitor;
import androidx.lifecycle.LifecycleOwner;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.tracing.Trace;
import app.cash.redwood.widget.RedwoodLayoutKt$toAndroid$1;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.workflow1.ui.modal.ModalContainer$update$2$1$2;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class BackHandlerKt {
    public static void bind(SupportSQLiteProgram supportSQLiteProgram, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                supportSQLiteProgram.bindNull(i);
            } else if (obj instanceof byte[]) {
                supportSQLiteProgram.bindBlob(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                supportSQLiteProgram.bindDouble(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                supportSQLiteProgram.bindDouble(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                supportSQLiteProgram.bindLong(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                supportSQLiteProgram.bindLong(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                supportSQLiteProgram.bindLong(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                supportSQLiteProgram.bindLong(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                supportSQLiteProgram.bindString(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                supportSQLiteProgram.bindLong(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewBoostDetails.deepLinkSpecs;
    }

    public static final void setBackHandler(ViewGroup viewGroup, RedwoodLayoutKt$toAndroid$1 redwoodLayoutKt$toAndroid$1) {
        viewGroup.getClass();
        if (viewGroup.isAttachedToWindow()) {
            LifecycleOwner lifecycleOwner = DBUtil.get(viewGroup);
            lifecycleOwner.getClass();
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = Trace.get(viewGroup);
            onBackPressedDispatcherOwner.getClass();
            onBackPressedDispatcherOwner.getOnBackPressedDispatcher().addCallback(redwoodLayoutKt$toAndroid$1, lifecycleOwner);
        } else {
            viewGroup.addOnAttachStateChangeListener(new ModalContainer$update$2$1$2(4, viewGroup, viewGroup, redwoodLayoutKt$toAndroid$1));
        }
        if (viewGroup.isAttachedToWindow()) {
            viewGroup.addOnAttachStateChangeListener(new SystemBarStateMonitor.AnonymousClass3(10, viewGroup, redwoodLayoutKt$toAndroid$1));
        } else {
            redwoodLayoutKt$toAndroid$1.remove();
        }
    }

    public static final void setBackHandler(ViewGroup viewGroup, Function0 function0) {
        function0.getClass();
        setBackHandler(viewGroup, new RedwoodLayoutKt$toAndroid$1(function0, 7));
    }
}
