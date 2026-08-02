package org.apache.commons.imaging.formats.tiff.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString;

/* loaded from: classes9.dex */
public final class MicrosoftTagConstants {
    public static final List<TagInfo> ALL_MICROSOFT_TAGS;
    public static final TagInfoShort EXIF_TAG_RATING;
    public static final TagInfoShort EXIF_TAG_RATING_PERCENT;
    public static final TagInfoXpString EXIF_TAG_XPAUTHOR;
    public static final TagInfoXpString EXIF_TAG_XPCOMMENT;
    public static final TagInfoXpString EXIF_TAG_XPKEYWORDS;
    public static final TagInfoXpString EXIF_TAG_XPSUBJECT;
    public static final TagInfoXpString EXIF_TAG_XPTITLE;

    static {
        TiffDirectoryType tiffDirectoryType = TiffDirectoryType.EXIF_DIRECTORY_IFD0;
        TagInfoShort tagInfoShort = new TagInfoShort("Rating", 18246, tiffDirectoryType);
        EXIF_TAG_RATING = tagInfoShort;
        TagInfoShort tagInfoShort2 = new TagInfoShort("RatingPercent", 18249, tiffDirectoryType);
        EXIF_TAG_RATING_PERCENT = tagInfoShort2;
        TagInfoXpString tagInfoXpString = new TagInfoXpString("XPTitle", 40091, tiffDirectoryType);
        EXIF_TAG_XPTITLE = tagInfoXpString;
        TagInfoXpString tagInfoXpString2 = new TagInfoXpString("XPComment", 40092, tiffDirectoryType);
        EXIF_TAG_XPCOMMENT = tagInfoXpString2;
        TagInfoXpString tagInfoXpString3 = new TagInfoXpString("XPAuthor", 40093, tiffDirectoryType);
        EXIF_TAG_XPAUTHOR = tagInfoXpString3;
        TagInfoXpString tagInfoXpString4 = new TagInfoXpString("XPKeywords", 40094, tiffDirectoryType);
        EXIF_TAG_XPKEYWORDS = tagInfoXpString4;
        TagInfoXpString tagInfoXpString5 = new TagInfoXpString("XPSubject", 40095, tiffDirectoryType);
        EXIF_TAG_XPSUBJECT = tagInfoXpString5;
        ALL_MICROSOFT_TAGS = Collections.unmodifiableList(Arrays.asList(tagInfoShort, tagInfoShort2, tagInfoXpString, tagInfoXpString2, tagInfoXpString3, tagInfoXpString4, tagInfoXpString5));
    }

    private MicrosoftTagConstants() {
    }
}
