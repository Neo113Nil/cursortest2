package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
class y {
    private static final JsonReader.a NAMES = JsonReader.a.of("nm", "mm", "hd");

    private y() {
    }

    static MergePaths parse(JsonReader jsonReader) {
        String str = null;
        MergePaths.MergePathsMode mergePathsMode = null;
        boolean z7 = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(NAMES);
            if (selectName == 0) {
                str = jsonReader.nextString();
            } else if (selectName == 1) {
                mergePathsMode = MergePaths.MergePathsMode.forId(jsonReader.nextInt());
            } else if (selectName != 2) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                z7 = jsonReader.nextBoolean();
            }
        }
        return new MergePaths(str, mergePathsMode, z7);
    }
}
