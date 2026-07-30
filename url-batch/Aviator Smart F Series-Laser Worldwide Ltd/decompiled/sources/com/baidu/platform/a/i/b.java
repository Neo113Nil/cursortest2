package com.baidu.platform.a.i;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.search.share.LocationShareURLOption;
import com.baidu.platform.comapi.basestruct.Point;
import com.baidu.platform.comapi.map.MapBundleKey;

/* loaded from: classes2.dex */
public class b extends com.baidu.platform.base.g {
    public b(LocationShareURLOption locationShareURLOption) {
        a(locationShareURLOption);
    }

    private void a(LocationShareURLOption locationShareURLOption) {
        this.f8720d.a("qt", "cs");
        Point ll2point = CoordUtil.ll2point(locationShareURLOption.mLocation);
        this.f8720d.a(MapBundleKey.MapObjKey.OBJ_GEO, ll2point.f8789x + b5.b.VERTICAL + ll2point.f8790y);
        this.f8720d.a("t", locationShareURLOption.mName);
        this.f8720d.a("cnt", locationShareURLOption.mSnippet);
        b(false);
        a(false);
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.v();
    }
}
