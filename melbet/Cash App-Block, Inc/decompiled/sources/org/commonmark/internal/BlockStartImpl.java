package org.commonmark.internal;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.ImageOutputConfig;
import com.squareup.cash.moneybot.genie.GenieForEachViewKt;
import java.io.Serializable;
import org.commonmark.parser.block.AbstractBlockParser;

/* loaded from: classes4.dex */
public final class BlockStartImpl {
    public final Serializable blockParsers;
    public int newColumn;
    public int newIndex;
    public boolean replaceActiveBlockParser;

    public BlockStartImpl(CameraInfoInternal cameraInfoInternal, Rational rational) {
        this.newIndex = cameraInfoInternal.getSensorRotationDegrees();
        this.newColumn = cameraInfoInternal.getLensFacing();
        this.blockParsers = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.replaceActiveBlockParser = z;
    }

    public Size getTargetSize(ImageOutputConfig imageOutputConfig) {
        int targetRotation = imageOutputConfig.getTargetRotation(0);
        Size size = (Size) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, null);
        int i = this.newColumn;
        int i2 = this.newIndex;
        if (size != null) {
            int relativeImageRotation = GenieForEachViewKt.getRelativeImageRotation(GenieForEachViewKt.surfaceRotationToDegrees(targetRotation), i2, 1 == i);
            if (relativeImageRotation == 90 || relativeImageRotation == 270) {
                return new Size(size.getHeight(), size.getWidth());
            }
        }
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BlockStartImpl(AbstractBlockParser... abstractBlockParserArr) {
        this.newIndex = -1;
        this.newColumn = -1;
        this.replaceActiveBlockParser = false;
        this.blockParsers = abstractBlockParserArr;
    }
}
