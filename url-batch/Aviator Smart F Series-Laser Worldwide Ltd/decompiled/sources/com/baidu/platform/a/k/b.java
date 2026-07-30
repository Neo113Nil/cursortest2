package com.baidu.platform.a.k;

import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.search.svg.SVGTileSearchOption;
import com.baidu.platform.base.g;
import com.baidu.platform.comapi.map.MapBundleKey;
import java.util.List;

/* loaded from: classes2.dex */
public class b extends g {
    public b(List<SVGTileSearchOption> list) {
        a(list);
    }

    private void a(List<SVGTileSearchOption> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.f8720d.a(HttpConstants.HTTP_MANUFACTURER, "huawei");
        this.f8720d.a("qt", "vtile");
        this.f8720d.a("styles", "pl");
        this.f8720d.a("udt", "21150328");
        this.f8720d.a("scaler", "2");
        this.f8720d.a("showtext", "1");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (SVGTileSearchOption sVGTileSearchOption : list) {
            if (sVGTileSearchOption != null) {
                sb.append(sVGTileSearchOption.mX);
                sb.append(SystemInfoUtil.COMMA);
                sb2.append(sVGTileSearchOption.mY);
                sb2.append(SystemInfoUtil.COMMA);
                sb3.append(sVGTileSearchOption.mZ);
                sb3.append(SystemInfoUtil.COMMA);
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        if (sb3.length() > 0) {
            sb3.setLength(sb3.length() - 1);
        }
        this.f8720d.a("x", sb.toString());
        this.f8720d.a("y", sb2.toString());
        this.f8720d.a(MapBundleKey.MapObjKey.OBJ_SS_ARROW_Z, sb3.toString());
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.l();
    }
}
