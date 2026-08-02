package io.appmetrica.analytics.coreutils.internal.permission;

import android.content.Context;
import d3.g;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class AnyOfPermissionStrategy extends MultiplePermissionBaseStrategy {
    public AnyOfPermissionStrategy(PermissionExtractor permissionExtractor, String... strArr) {
        super(permissionExtractor, g.Y(strArr));
    }

    @Override // io.appmetrica.analytics.coreutils.internal.permission.MultiplePermissionBaseStrategy
    public boolean hasNecessaryPermissions(Context context, PermissionExtractor permissionExtractor, List<String> list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (permissionExtractor.hasPermission(context, (String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
