package gbcorp.c312.merkmarker.info.ui.composable.approot;

import androidx.compose.ui.graphics.vector.ImageVector;
import gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppBottomBar.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/composable/approot/BottomNavItem;", "", "titleRes", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "route", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute;", "<init>", "(ILandroidx/compose/ui/graphics/vector/ImageVector;Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute;)V", "getTitleRes", "()I", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getRoute", "()Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BottomNavItem {
    public static final int $stable = 0;
    private final ImageVector icon;
    private final NavRoute route;
    private final int titleRes;

    public static /* synthetic */ BottomNavItem copy$default(BottomNavItem bottomNavItem, int i, ImageVector imageVector, NavRoute navRoute, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bottomNavItem.titleRes;
        }
        if ((i2 & 2) != 0) {
            imageVector = bottomNavItem.icon;
        }
        if ((i2 & 4) != 0) {
            navRoute = bottomNavItem.route;
        }
        return bottomNavItem.copy(i, imageVector, navRoute);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTitleRes() {
        return this.titleRes;
    }

    /* renamed from: component2, reason: from getter */
    public final ImageVector getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final NavRoute getRoute() {
        return this.route;
    }

    public final BottomNavItem copy(int titleRes, ImageVector icon, NavRoute route) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(route, "route");
        return new BottomNavItem(titleRes, icon, route);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomNavItem)) {
            return false;
        }
        BottomNavItem bottomNavItem = (BottomNavItem) other;
        return this.titleRes == bottomNavItem.titleRes && Intrinsics.areEqual(this.icon, bottomNavItem.icon) && Intrinsics.areEqual(this.route, bottomNavItem.route);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.titleRes) * 31) + this.icon.hashCode()) * 31) + this.route.hashCode();
    }

    public String toString() {
        return "BottomNavItem(titleRes=" + this.titleRes + ", icon=" + this.icon + ", route=" + this.route + ")";
    }

    public BottomNavItem(int i, ImageVector icon, NavRoute route) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(route, "route");
        this.titleRes = i;
        this.icon = icon;
        this.route = route;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final ImageVector getIcon() {
        return this.icon;
    }

    public final NavRoute getRoute() {
        return this.route;
    }
}
