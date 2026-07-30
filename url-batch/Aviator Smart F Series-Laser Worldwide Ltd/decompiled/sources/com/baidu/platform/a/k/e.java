package com.baidu.platform.a.k;

import com.baidu.ar.constants.HttpConstants;
import com.baidu.mapapi.search.svg.SVGTileSearchOption;
import com.baidu.platform.base.g;
import com.baidu.platform.comapi.map.MapBundleKey;

/* loaded from: classes2.dex */
public class e extends g {
    public e(SVGTileSearchOption sVGTileSearchOption) {
        a(sVGTileSearchOption);
    }

    private void a(SVGTileSearchOption sVGTileSearchOption) {
        if (sVGTileSearchOption == null) {
            return;
        }
        this.f8720d.a(HttpConstants.HTTP_MANUFACTURER, "huawei");
        this.f8720d.a("qt", "vtile");
        this.f8720d.a("styles", "pl");
        this.f8720d.a("udt", "21150328");
        this.f8720d.a("scaler", "2");
        this.f8720d.a("showtext", "1");
        this.f8720d.a("x", String.valueOf(sVGTileSearchOption.mX));
        this.f8720d.a("y", String.valueOf(sVGTileSearchOption.mY));
        this.f8720d.a(MapBundleKey.MapObjKey.OBJ_SS_ARROW_Z, String.valueOf(sVGTileSearchOption.mZ));
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.j();
    }
}
