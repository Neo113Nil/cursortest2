package net.oneformapp.helper.matching;

import com.fillr.service.CaptureFieldsMappingService;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class POPMatchingGender {
    public final /* synthetic */ int $r8$classId;
    public boolean mIsValid = true;
    public final String mStrFormValue;

    public POPMatchingGender(String str, int i) {
        this.$r8$classId = i;
        this.mStrFormValue = str;
    }

    public static String getValueFromVariants(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("Titles");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string2 = jSONObject2.getString("Title");
                if (!string2.equalsIgnoreCase(str)) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("Variants");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        if (!jSONArray2.getString(i2).equalsIgnoreCase(str)) {
                        }
                    }
                }
                return string2;
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final JSONObject getMatchingFile(CaptureFieldsMappingService captureFieldsMappingService, int i) {
        try {
            InputStream openRawResource = captureFieldsMappingService.getResources().openRawResource(i);
            byte[] bArr = new byte[openRawResource.available()];
            openRawResource.read(bArr);
            openRawResource.close();
            return new JSONObject(new String(bArr));
        } catch (IOException e) {
            e.printStackTrace();
            this.mIsValid = false;
            return null;
        } catch (JSONException e2) {
            e2.printStackTrace();
            this.mIsValid = false;
            return null;
        }
    }
}
